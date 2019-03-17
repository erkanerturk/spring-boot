package com.demo.springboot.Business;

import com.demo.springboot.Entities.City;

import java.util.List;

public interface ICityService {
    List<City> getAll();

    City getById(long id);

    void add(City city);

    void update(City city);

    void delete(City city);
}
