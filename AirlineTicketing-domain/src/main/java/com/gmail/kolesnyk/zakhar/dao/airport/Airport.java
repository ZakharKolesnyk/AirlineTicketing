package com.gmail.kolesnyk.zakhar.dao.airport;


import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import com.gmail.kolesnyk.zakhar.dao.BaseDao;
import com.gmail.kolesnyk.zakhar.dao.city.City;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The {@code Airport} JPA entity that mapped on table "airports"
 *
 * @author Kolesnyk Zakhar
 * @see com.gmail.kolesnyk.zakhar.dao.airport.AirportDao
 * @see com.gmail.kolesnyk.zakhar.dao.BaseDao
 * @see com.gmail.kolesnyk.zakhar.dao.AbstractDao
 * @see BaseDao
 * @see AbstractDao
 * @since JDK1.8
 */
@Entity
@Table(name = "airports")
public class Airport implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_airport")
    private Integer idAirport;

    @JoinColumn(name = "id_city", referencedColumnName = "id_city")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private City city;

    public Airport() {
    }

    public Integer getIdAirport() {
        return idAirport;
    }

    public void setIdAirport(Integer idAirport) {
        this.idAirport = idAirport;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
