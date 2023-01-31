package com.example.library.Controllers;

import com.example.library.PoJo.entity.LibraryCostumer;
import com.example.library.PoJo.input.LibraryCostumerInput;
import com.example.library.Services.LibraryCostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class LibraryCostumerController {

    @Autowired
    private LibraryCostumerService libraryCostumerService;

    @GetMapping("/librarycostumer")
    public List<LibraryCostumer> getCostumer() {
        return libraryCostumerService.findAll();
    }

    @GetMapping("/librarycostumer/{id}")
    public LibraryCostumer findCostumer(@PathVariable Integer id) {
        return libraryCostumerService.findCostumerById(id);
    }

    @PostMapping("/librarycostumer")
    public LibraryCostumer createCostumer(@RequestBody LibraryCostumerInput costumerInput) {
        return libraryCostumerService.save(costumerInput);
    }

    @PutMapping("/librarycostumer/{id}")
    public LibraryCostumer updateCostumer(@PathVariable Integer id,
                                          @RequestBody LibraryCostumerInput costumerInput) {

        LibraryCostumer libraryCostumer = libraryCostumerService.findCostumerById(id);
        if (libraryCostumer == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Note object with " + id + " not found!"
            );
        }

        return libraryCostumerService.update(libraryCostumer, costumerInput);
    }

    @DeleteMapping("/librarycostumer/{id}")
    public boolean deleteCostumer(@PathVariable Integer id) {
        libraryCostumerService.delete(id);
        return true;
    }

}
