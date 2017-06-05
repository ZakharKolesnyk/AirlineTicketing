package com.gmail.kolesnyk.zakhar.dao.city;


import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import com.gmail.kolesnyk.zakhar.dao.BaseDao;
import com.gmail.kolesnyk.zakhar.dao.country.Country;

import javax.persistence.*;
import java.io.Serializable;

/**
 * The {@code City} JPA entity that mapped on table "cities"
 *
 * @author Kolesnyk Zakhar
 * @see com.gmail.kolesnyk.zakhar.dao.city.CityDao
 * @see com.gmail.kolesnyk.zakhar.dao.BaseDao
 * @see com.gmail.kolesnyk.zakhar.dao.AbstractDao
 * @see BaseDao
 * @see AbstractDao
 * @since JDK1.8
 */
@Entity
@Table(name = "cities")
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_city")
    private Integer idCity;

    @Column(name = "name_city")
    private String nameSity;

    @JoinColumn(name = "id_country", referencedColumnName = "id_country")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Country country;

    public City() {
    }

    @Override
    public String toString() {
        return "City{" +
                "idCity=" + idCity +
                ", nameSity='" + nameSity + '\'' +
                ", country=" + country +
                '}';
    }

    public String getNameSity() {
        return nameSity;
    }

    public void setNameSity(String nameSity) {
        this.nameSity = nameSity;
    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
