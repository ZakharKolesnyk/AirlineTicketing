package com.gmail.kolesnyk.zakhar.dao.flight;


import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import com.gmail.kolesnyk.zakhar.dao.BaseDao;
import com.gmail.kolesnyk.zakhar.dao.airport.Airport;
import com.gmail.kolesnyk.zakhar.dao.seat.Seat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
public class Flight implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_flight")
    private Integer idFlight;

    @Column(name = "departure_date")
    private String departureDate;

    @Column(name = "arrival_date")
    private String arrivalDate;

    @JoinColumn(name = "id_departure_airport", referencedColumnName = "id_airport")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Airport departureAirport;

    @JoinColumn(name = "id_destination_airport", referencedColumnName = "id_airport")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Airport destinationAirport;

    @Column(name = "range_flight")
    private Integer rangeFlight;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "seats",
            joinColumns = {@JoinColumn(name = "id_flight")},
            inverseJoinColumns = {@JoinColumn(name = "id_seat")})
    private List<Seat> seats;

    public Flight() {
    }

    @Override
    public String toString() {
        return "Flight{" +
                "idFlight=" + idFlight +
                ", departureDate='" + departureDate + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", departureAirport=" + departureAirport +
                ", destinationAirport=" + destinationAirport +
                ", rangeFlight=" + rangeFlight +
                ", seats=" + seats +
                '}';
    }

    public Integer getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(Integer idFlight) {
        this.idFlight = idFlight;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public Integer getRangeFlight() {
        return rangeFlight;
    }

    public void setRangeFlight(Integer rangeFlight) {
        this.rangeFlight = rangeFlight;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
