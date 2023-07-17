/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt.application.converter;

import org.springframework.stereotype.Component;
import rs.ac.bg.fon.njt.application.dto.CityDto;
import rs.ac.bg.fon.njt.application.model.CityEntity;

/**
 *
 * @author student2
 */
@Component
public class CityConverter implements Converter<CityEntity, CityDto> {

    @Override
    public CityEntity toEntity(CityDto dto) {
        return new CityEntity(dto.getNumber(), dto.getName());
    }

    @Override
    public CityDto toDto(CityEntity entity) {
        return new CityDto(entity.getNumber(), entity.getName());
    }

}
