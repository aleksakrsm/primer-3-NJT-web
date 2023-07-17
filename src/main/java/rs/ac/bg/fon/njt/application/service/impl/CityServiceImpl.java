/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt.application.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.njt.application.converter.CityConverter;
import rs.ac.bg.fon.njt.application.dao.CityRepository;
import rs.ac.bg.fon.njt.application.dto.CityDto;
import rs.ac.bg.fon.njt.application.exception.InvalidEntityException;
import rs.ac.bg.fon.njt.application.model.CityEntity;
import rs.ac.bg.fon.njt.application.service.CityService;

/**
 *
 * @author student2
 */
@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;
    private final CityConverter cityConverter;

    public CityServiceImpl(CityRepository cityRepository, CityConverter cityConverter) {
        this.cityRepository = cityRepository;
        this.cityConverter = cityConverter;
    }

    @Override
    public CityDto save(CityDto city) throws InvalidEntityException {
        CityEntity cityEntity = cityConverter.toEntity(city);
        Optional<CityEntity> entity = cityRepository.findById(cityEntity.getNumber());
        if (entity.isPresent()) {
            throw new InvalidEntityException("City already exists!");
        }
        return cityConverter.toDto(cityRepository.save(cityEntity));
    }

    @Override
    public void delete(Long number) throws InvalidEntityException {
        Optional<CityEntity> city = cityRepository.findById(number);
        if (!city.isPresent()) {
            throw new InvalidEntityException("Invalid city!");
        }
        cityRepository.deleteById(number);
    }

    @Override
    public List<CityDto> findAll() {
        List<CityEntity> cities = cityRepository.findAll();
        return cities.stream().map(entity -> {
            return cityConverter.toDto(entity);
        }).collect(Collectors.toList());
    }

    @Override
    public Optional<CityDto> findById(Long number) {
        Optional<CityEntity> city = cityRepository.findById(number);
        if (city.isPresent()) {
            return Optional.of(cityConverter.toDto(city.get()));
        }
        return Optional.empty();
    }

}
