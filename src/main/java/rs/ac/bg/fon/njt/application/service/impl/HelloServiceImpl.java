/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.njt.application.service.impl;

import org.springframework.stereotype.Service;
import rs.ac.bg.fon.njt.application.service.HelloService;

/**
 *
 * @author student2
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHallo(String name) {
        return "Hello, " + name;
    }

}
