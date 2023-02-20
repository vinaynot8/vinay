package com.example.Cars.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Cars.Model.Cars;
import com.example.Cars.Repository.CarsRepository;

@Service
public class CarsService {
    @Autowired
	CarsRepository carsRepository;
   
//    static {
//    	 cars.add(new Cars(1,"ford","figo",50000));
//    }
   
    public List<Cars> getAllCars()
    {
    	List<Cars> cars=new ArrayList<Cars>();
    	
    	//cars=(List<Cars>) carsRepository.findAll();//.forEach(a->cars.add(a));
		return carsRepository.findAll();
    }
	public Cars getCarsById(int id)
	{
		return carsRepository.findById(id).get();
	}
	public Cars saveOrUpdate(Cars cars)
	{
		return carsRepository.save(cars);
	}
	public void delete(int id)
	{
		carsRepository.deleteById(id);
	}
	public void saveOrUpdate(Cars cars, int id)
	{
		carsRepository.save(cars);
	}
}