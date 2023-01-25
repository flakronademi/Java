package com.example.demo.controller;

import com.example.demo.pojo.entity.Costumer;
import com.example.demo.pojo.input.CostumerInput;
import com.example.demo.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class CostumerController {

    @Autowired
    private CostumerService costumerService;

    @GetMapping("/costumer")
    public List<Costumer> getCostumer() {
        return costumerService.findAll();
    }

    @GetMapping("/costumer/{id}")
    public Costumer findCostumer(@PathVariable Integer id) {
        return costumerService.findCostumerById(id);
    }

    @PostMapping("/costumer")
    public Costumer createCostumer(@RequestBody CostumerInput costumerInput) {
        return costumerService.save(costumerInput);
    }

    @PutMapping("/costumer/{id}")
    public Costumer updateCostumer(@PathVariable Integer id,
                               @RequestBody CostumerInput costumerInput) {

        Costumer costumer = costumerService.findCostumerById(id);
        if (costumer == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Note object with " + id + " not found!"
            );
        }

        return costumerService.update(costumer, costumerInput);
    }

    @DeleteMapping("/costumer/{id}")
    public boolean deleteCostumer(@PathVariable Integer id) {
        costumerService.delete(id);
        return true;
    }

}
