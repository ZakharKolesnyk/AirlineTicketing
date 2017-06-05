package com.gmail.kolesnyk.zakhar.dao.plane;

import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import com.gmail.kolesnyk.zakhar.dao.BaseDao;

import javax.persistence.*;

/**
 * The {@code Plane} JPA entity that mapped on table "planes"
 *
 * @author Kolesnyk Zakhar
 * @see com.gmail.kolesnyk.zakhar.dao.plane.PlaneDao
 * @see com.gmail.kolesnyk.zakhar.dao.BaseDao
 * @see com.gmail.kolesnyk.zakhar.dao.AbstractDao
 * @see BaseDao
 * @see AbstractDao
 * @since JDK1.8
 */
@Entity
@Table(name = "planes")
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plane")
    private Integer idPlane;

    @Column(name = "name_flight")
    private String nameFlight;

    @Column(name = "model_plane")
    private String modelPlane;

    public Plane() {
    }

    @Override
    public String toString() {
        return "Plane{" +
                "idPlane=" + idPlane +
                ", nameFlight='" + nameFlight + '\'' +
                ", modelPlane='" + modelPlane + '\'' +
                '}';
    }

    public Integer getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(Integer idPlane) {
        this.idPlane = idPlane;
    }

    public String getNameFlight() {
        return nameFlight;
    }

    public void setNameFlight(String nameFlight) {
        this.nameFlight = nameFlight;
    }

    public String getModelPlane() {
        return modelPlane;
    }

    public void setModelPlane(String modelPlane) {
        this.modelPlane = modelPlane;
    }
}
