package freelancerlottery.model;
// Generated May 10, 2016 4:58:03 PM by Hibernate Tools 3.2.1.GA


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
     private Ticket ticket;
     private DrawResult drawResult;
     private Date drawDate;
     private String winType;

    public WinTicket() {
    }

    public WinTicket(Ticket ticket, DrawResult drawResult, Date drawDate, String winType) {
       this.ticket = ticket;
       this.drawResult = drawResult;
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
    @JoinColumn(name="ticket_id", nullable=false)
    public Ticket getTicket() {
        return this.ticket;
    }
    
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="draw_result_id", nullable=false)
    public DrawResult getDrawResult() {
        return this.drawResult;
    }
    
    public void setDrawResult(DrawResult drawResult) {
        this.drawResult = drawResult;
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


