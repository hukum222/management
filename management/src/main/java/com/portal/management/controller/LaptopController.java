package com.portal.management.controller;

import com.portal.management.dao.ILaptopRepository;
import com.portal.management.model.Laptop;
import com.portal.management.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/laptop")
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    //add
    @PostMapping("/add")
    public Laptop addLaptop(@RequestBody Laptop laptop) {
        return laptopService.addLaptop(laptop);
    }

    //get by id
    @GetMapping("/findbyid/{id}")
    public Laptop getLaptopById(@PathVariable int id) {
        return laptopService.getLaptopById(id);
    }


    //update
    @PutMapping("/updatelaptop/{id}")
    public void updateLaptop(@PathVariable int id,@RequestBody Laptop newLaptop) {
        laptopService.updateLaptopById(id, newLaptop);
    }

    //delete student by id

    @DeleteMapping("delete/{id}")
    public void deleteLaptop(@PathVariable int id) {
        laptopService.deleteLaptopById(id);
    }

    //get all

    @GetMapping("/findall")
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptop();
    }

}