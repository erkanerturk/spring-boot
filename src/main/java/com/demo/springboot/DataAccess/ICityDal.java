package com.demo.springboot.DataAccess;

import com.demo.springboot.Entities.City;

import java.util.List;

public interface ICityDal {
    List<City> getAll();

    City getById(long id);

    void add(City city);

    void update(City city);

    void delete(City city);
}
