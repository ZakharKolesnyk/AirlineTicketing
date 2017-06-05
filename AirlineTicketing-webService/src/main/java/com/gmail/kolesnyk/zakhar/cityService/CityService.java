package com.gmail.kolesnyk.zakhar.cityService;


import com.gmail.kolesnyk.zakhar.dao.city.City;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CityService {
    @Transactional(readOnly = true)
    List<City> listCity();

    @Transactional(readOnly = true)
    List<City> listCityByIdCountry(int id);
}
