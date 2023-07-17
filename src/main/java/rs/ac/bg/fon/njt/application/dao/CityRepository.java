/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rs.ac.bg.fon.njt.application.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.bg.fon.njt.application.model.CityEntity;

/**
 *
 * @author student2
 */
@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {

    //@Query("SELECT c FROM CityEntity c WHERE c.name = ?1")
    List<CityEntity> findByName(String name);
}
