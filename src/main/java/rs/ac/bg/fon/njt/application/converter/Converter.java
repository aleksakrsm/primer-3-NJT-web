/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rs.ac.bg.fon.njt.application.converter;

import rs.ac.bg.fon.njt.application.dto.ApplicationDto;
import rs.ac.bg.fon.njt.application.model.ApplicationEntity;

/**
 *
 * @author student2
 */
public interface Converter<E extends ApplicationEntity, D extends ApplicationDto> {

    E toEntity(D dto);

    D toDto(E entity);
}
