/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rs.ac.bg.fon.njt.application.service;

import java.util.List;
import java.util.Optional;
import rs.ac.bg.fon.njt.application.dto.CityDto;
import rs.ac.bg.fon.njt.application.exception.InvalidEntityException;

/**
 *
 * @author student2
 */
public interface CityService {

    CityDto save(CityDto city) throws InvalidEntityException;

    void delete(Long number) throws InvalidEntityException;

    List<CityDto> findAll();

    Optional<CityDto> findById(Long number);
}
