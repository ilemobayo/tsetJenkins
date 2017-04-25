/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.controller;

import com.client.service.ManagerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Wasp Networks
 */
@RestController
public class App {
    
    @RequestMapping("/")
    public ManagerService app(){
    	//
        RestTemplate temp = new RestTemplate();
        ManagerService visit = temp.getForObject("http://localhost:8090/", ManagerService.class);
        return visit;
    }
}
