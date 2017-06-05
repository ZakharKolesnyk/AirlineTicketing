package com.gmail.kolesnyk.zakhar.dao.seat;

import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import com.gmail.kolesnyk.zakhar.dao.BaseDao;

import javax.persistence.*;

/**
 * The {@code Seat} JPA entity that mapped on table "seats"
 *
 * @author Kolesnyk Zakhar
 * @see com.gmail.kolesnyk.zakhar.dao.seat.SeatDao
 * @see com.gmail.kolesnyk.zakhar.dao.BaseDao
 * @see com.gmail.kolesnyk.zakhar.dao.AbstractDao
 * @see BaseDao
 * @see AbstractDao
 * @since JDK1.8
 */
@Entity
@Table(name = "seats")
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seat")
    private Integer idSeat;

    @Column(name = "id_flight")
    private Integer idFlight;

    @Column(name = "price")
    private Double price;

    @Column(name = "reserved")
    private Boolean reserved;

    @JoinColumn(name = "id_enum_seat", referencedColumnName = "id_enum_seat")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private EnumSeat enumSeat;

    public Seat() {
    }

    public void setIdSeat(Integer idSeat) {
        this.idSeat = idSeat;
    }

    public EnumSeat getEnumSeat() {
        return enumSeat;
    }

    public void setEnumSeat(EnumSeat enumSeat) {
        this.enumSeat = enumSeat;
    }

    public Integer getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(Integer idFlight) {
        this.idFlight = idFlight;
    }

    public Integer getIdSeat() {
        return idSeat;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getReserved() {
        return reserved;
    }

    public void setReserved(Boolean reserved) {
        this.reserved = reserved;
    }
}
