package com.gmail.kolesnyk.zakhar.dao.city;


import com.gmail.kolesnyk.zakhar.dao.AbstractDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDaoImpl extends AbstractDao<City, Integer> implements CityDao {
    @Override
    @SuppressWarnings("unchecked")
    public List<City> listByIdCountry(int id) {
        return sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM cities WHERE id_country = :id")
                .addEntity(City.class).setParameter("id", id).list();
    }
}
