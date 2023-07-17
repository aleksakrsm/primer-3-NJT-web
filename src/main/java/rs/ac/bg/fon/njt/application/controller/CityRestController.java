/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt.application.controller;

import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.ac.bg.fon.njt.application.dto.CityDto;
import rs.ac.bg.fon.njt.application.exception.InvalidEntityException;
import rs.ac.bg.fon.njt.application.service.CityService;

/**
 *
 * @author student2
 */
@RestController
@RequestMapping("/city")
public class CityRestController {

    private final CityService cityService;

    public CityRestController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/all")
    public List<CityDto> findAll() {
        return cityService.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<Object> save(@Valid @RequestBody CityDto cityDto) {
        try {
            //return ResponseEntity.ok(cityService.save(cityDto));
            return ResponseEntity.status(HttpStatus.CREATED).body(cityService.save(cityDto));
        } catch (InvalidEntityException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

}
