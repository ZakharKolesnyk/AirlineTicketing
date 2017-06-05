package com.gmail.kolesnyk.zakhar.dao.seat;

import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import com.gmail.kolesnyk.zakhar.dao.BaseDao;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The {@code EnumSeat} JPA entity that mapped on table "enum_seats"
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
@Table(name = "enum_seats")
public class EnumSeat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enum_seat")
    private Integer idEnumSeat;

    @Column(name = "name_seat")
    private String nameSeat;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "type_seat")
    private TYPE_SEAT typeSeat;

    public EnumSeat() {
    }

    @Override
    public String toString() {
        return "EnumSeat{" +
                "idEnumSeat=" + idEnumSeat +
                ", nameSeat='" + nameSeat + '\'' +
                ", typeSeat=" + typeSeat +
                '}';
    }

    public Integer getIdEnumSeat() {
        return idEnumSeat;
    }

    public void setIdEnumSeat(Integer idEnumSeat) {
        this.idEnumSeat = idEnumSeat;
    }

    public String getNameSeat() {
        return nameSeat;
    }

    public void setNameSeat(String nameSeat) {
        this.nameSeat = nameSeat;
    }

    public TYPE_SEAT getTypeSeat() {
        return typeSeat;
    }

    public void setTypeSeat(TYPE_SEAT typeSeat) {
        this.typeSeat = typeSeat;
    }
}
