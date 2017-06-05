package com.gmail.kolesnyk.zakhar.dao.flight;


import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import com.gmail.kolesnyk.zakhar.dao.BaseDao;
import com.gmail.kolesnyk.zakhar.dao.airport.Airport;
import com.gmail.kolesnyk.zakhar.dao.seat.Seat;

import javax.persistence.*;

/**
 * The {@code Flight} JPA entity that mapped on table "flights"
 *
 * @author Kolesnyk Zakhar
 * @see com.gmail.kolesnyk.zakhar.dao.flight.FlightDao
 * @see com.gmail.kolesnyk.zakhar.dao.BaseDao
 * @see com.gmail.kolesnyk.zakhar.dao.AbstractDao
 * @see BaseDao
 * @see AbstractDao
 * @since JDK1.8
 */
@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_flight")
    private Integer idFlight;

    @Column(name = "departure_date")
    private String departureDate;

    @Column(name = "arrival_date")
    private String arrivalDate;

    @JoinColumn(name = "id_airport", referencedColumnName = "id_airport")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Airport departureAirport;

    @JoinColumn(name = "id_airport", referencedColumnName = "id_airport")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Airport destinationAirport;

    @Column(name = "range")
    private Integer range;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "seat")
    private Seat[] seats;

    public Flight() {
    }
}
