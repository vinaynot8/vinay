package com.example.Cars.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Cars.Model.Cars;
import com.example.Cars.Service.CarsService;

import org.springframework.web.bind.annotation.*;
@RestController
public class CarsController {
    @Autowired
	CarsService carsService;
    
    @GetMapping("/cars")
    public List<Cars> getAllcars()
    {
		return carsService.getAllCars();	
    }
    @GetMapping("/cars/{id}")
    public Cars getCarsById(@PathVariable("id") int id)
    {
		return carsService.getCarsById(id);
    }
    @DeleteMapping("/cars/{id}")
    public List<Cars> deleteById(@PathVariable("id") int id)
    {
    	carsService.delete(id);
		return carsService.getAllCars();
    }
    @PostMapping("/caradd")
    public List<Cars> save(@RequestBody Cars cars)
    {
    	carsService.saveOrUpdate(cars);
		return carsService.getAllCars();
    }
    @PutMapping("/carupdate")
    public List<Cars> update(@RequestBody Cars cars, int id)
    {
    	carsService.saveOrUpdate(cars, id);
		return carsService.getAllCars();
    }	
    
}
	