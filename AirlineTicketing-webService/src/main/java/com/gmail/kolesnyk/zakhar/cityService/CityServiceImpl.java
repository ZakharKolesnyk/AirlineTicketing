package com.gmail.kolesnyk.zakhar.cityService;

import com.gmail.kolesnyk.zakhar.AbstractService;
import com.gmail.kolesnyk.zakhar.dao.city.City;
import com.gmail.kolesnyk.zakhar.dao.city.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityServiceImpl extends AbstractService implements CityService {

    @Autowired
    private CityDao cityDao;

    public CityServiceImpl(@Autowired Environment environment) {
        super(environment);
    }

    @Override
    public List<City> listCity() {
        return cityDao.list();
    }
    
    @Override
    public List<City> listCityByIdCountry(int id){
        return cityDao.listByIdCountry(id);
    }
}
