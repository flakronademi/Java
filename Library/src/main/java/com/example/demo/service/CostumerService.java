package com.example.demo.service;

import com.example.demo.pojo.entity.Costumer;
import com.example.demo.pojo.input.CostumerInput;

import java.util.List;

public interface CostumerService {

    List<Costumer> findAll();
    Costumer findCostumerById(Integer id);
    Costumer save(CostumerInput costumerInput);
    Costumer update(Costumer location, CostumerInput costumerInput);
    void delete(Integer id);
}
