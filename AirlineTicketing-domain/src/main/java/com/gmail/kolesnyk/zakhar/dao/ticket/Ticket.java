package com.gmail.kolesnyk.zakhar.dao.ticket;

import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import com.gmail.kolesnyk.zakhar.dao.BaseDao;
import com.gmail.kolesnyk.zakhar.dao.flight.Flight;
import com.gmail.kolesnyk.zakhar.dao.seat.Seat;
import com.gmail.kolesnyk.zakhar.dao.user.User;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The {@code Ticket} JPA entity that mapped on table "tickets"
 *
 * @author Kolesnyk Zakhar
 * @see com.gmail.kolesnyk.zakhar.dao.ticket.TicketDao
 * @see com.gmail.kolesnyk.zakhar.dao.BaseDao
 * @see com.gmail.kolesnyk.zakhar.dao.AbstractDao
 * @see BaseDao
 * @see AbstractDao
 * @since JDK1.8
 */
@Entity
@Table(name = "tickets")
public class Ticket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private Integer idTicket;

    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private User user;

    @JoinColumn(name = "id_flight", referencedColumnName = "id_flight")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Flight flight;

    @CreationTimestamp
    @Column(name = "date_order")
    private Timestamp dateOrder;

    @JoinColumn(name = "id_seat", referencedColumnName = "id_seat")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Seat seat;

    @Column(name = "cost")
    private Double cost;

    public Ticket() {
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "idTicket=" + idTicket +
                ", user=" + user +
                ", flight=" + flight +
                ", dateOrder=" + dateOrder +
                ", seat=" + seat +
                ", cost=" + cost +
                '}';
    }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Timestamp getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Timestamp dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
