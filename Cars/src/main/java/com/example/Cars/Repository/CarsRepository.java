package com.example.Cars.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Cars.Model.Cars;
@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer>{

}
