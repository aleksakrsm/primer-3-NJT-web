/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt.application.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 *
 * @author student2
 */
public class CityDto implements ApplicationDto {

    @NotNull(message = "Number is required field!")
    private Long number;
    @Size(min = 2, max = 50, message = "Name must contain 2-50 letters!")
    @NotNull
    private String name;

    public CityDto() {
    }

    public CityDto(Long number, String name) {
        this.number = number;
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
