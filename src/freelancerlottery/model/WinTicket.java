package freelancerlottery.model;
// Generated May 9, 2016 1:10:30 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * WinTicket generated by hbm2java
 */
@Entity
@Table(name="win_ticket"
    ,catalog="lottery"
)
public class WinTicket  implements java.io.Serializable {


     private Long id;
     private DrawResult drawResult;
     private Ticket ticket;
     private Date drawDate;
     private String winType;

    public WinTicket() {
    }

    public WinTicket(DrawResult drawResult, Ticket ticket, Date drawDate, String winType) {
       this.drawResult = drawResult;
       this.ticket = ticket;
       this.drawDate = drawDate;
       this.winType = winType;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="draw_result_id", nullable=false)
    public DrawResult getDrawResult() {
        return this.drawResult;
    }
    
    public void setDrawResult(DrawResult drawResult) {
        this.drawResult = drawResult;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ticket_id", nullable=false)
    public Ticket getTicket() {
        return this.ticket;
    }
    
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="draw_date", nullable=false, length=10)
    public Date getDrawDate() {
        return this.drawDate;
    }
    
    public void setDrawDate(Date drawDate) {
        this.drawDate = drawDate;
    }

    
    @Column(name="win_type", nullable=false, length=10)
    public String getWinType() {
        return this.winType;
    }
    
    public void setWinType(String winType) {
        this.winType = winType;
    }




}

