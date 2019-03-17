package com.demo.springboot.api;

import com.demo.springboot.Business.ICityService;
import com.demo.springboot.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CityController {

    private ICityService cityService;

    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public List<City> get() {
        return cityService.getAll();
    }

    @GetMapping("/city/{id}")
    public City getById(@PathVariable long id) {
        return cityService.getById(id);
    }

    @PostMapping("/city")
    public void add(@RequestBody City city) {
        cityService.add(city);
    }

    @PutMapping("/city")
    public void update(@RequestBody City city) {
        cityService.update(city);
    }

    @DeleteMapping("/city")
    public void delete(@RequestBody City city) {
        cityService.delete(city);
    }

}
