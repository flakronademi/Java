package com.example.demo.repository;

import com.example.demo.pojo.entity.Costumer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CostumerRepository extends CrudRepository<Costumer, Integer> {

    List<Costumer> findAll();
    Costumer findCostumerById(Integer id);

}
