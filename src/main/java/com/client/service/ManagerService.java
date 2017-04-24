/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Wasp Networks
 */
@Service
public class ManagerService {
    private String dataReturned;
    
    public ManagerService(){
    }
    
    public void setDataReturned(String txt){
        this.dataReturned = txt;
    }
    
    public String getDataReturned(){
        return dataReturned;
    }
}
