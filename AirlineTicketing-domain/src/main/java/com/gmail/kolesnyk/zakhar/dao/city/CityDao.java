package com.gmail.kolesnyk.zakhar.dao.city;


import com.gmail.kolesnyk.zakhar.dao.BaseDao;

import java.util.List;

public interface CityDao extends BaseDao<City, Integer> {
    List<City> listByIdCountry(int id);
}
