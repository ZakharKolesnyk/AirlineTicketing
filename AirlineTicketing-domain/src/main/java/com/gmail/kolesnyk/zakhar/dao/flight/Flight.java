package com.gmail.kolesnyk.zakhar.dao.flight;


import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import com.gmail.kolesnyk.zakhar.dao.BaseDao;
import com.gmail.kolesnyk.zakhar.dao.airport.Airport;
import com.gmail.kolesnyk.zakhar.dao.plane.Plane;
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
    private Long departureDate;

    @Column(name = "arrival_date")
    private Long arrivalDate;

    @JoinColumn(name = "id_departure_airport", referencedColumnName = "id_airport")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Airport departureAirport;

    @JoinColumn(name = "id_destination_airport", referencedColumnName = "id_airport")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Airport destinationAirport;

    @Column(name = "range_flight")
    private Integer rangeFlight;

    @JoinColumn(name = "id_plane", referencedColumnName = "id_plane")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Plane plane;

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
                ", departureDate=" + departureDate +
                ", arrivalDate=" + arrivalDate +
                ", departureAirport=" + departureAirport +
                ", destinationAirport=" + destinationAirport +
                ", rangeFlight=" + rangeFlight +
                ", plane=" + plane +
                ", seats=" + seats +
                '}';
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Integer getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(Integer idFlight) {
        this.idFlight = idFlight;
    }

    public Long getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Long departureDate) {
        this.departureDate = departureDate;
    }

    public Long getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Long arrivalDate) {
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
