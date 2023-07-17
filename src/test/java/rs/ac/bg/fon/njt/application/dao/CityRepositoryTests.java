/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt.application.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rs.ac.bg.fon.njt.application.model.CityEntity;

/**
 *
 * @author student2
 */
@SpringBootTest
public class CityRepositoryTests {

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void saveSuccessTest() {
        CityEntity city = cityRepository.save(new CityEntity(1l, "Save_Test_1"));
        Assertions.assertNotNull(city);
    }

}
