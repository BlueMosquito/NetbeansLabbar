/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import factory.BrokerFactory;
import interfaces.LeaguestatsService;

/**
 *
 * @author hamednajafi
 */
public abstract class BaseService<T> implements LeaguestatsService<T> {
    
    public BrokerFactory brokerFactory;
    
    @Override 
    public void init(BrokerFactory brokerFactory) { 
        this.brokerFactory = brokerFactory;
    }
    
    public BrokerFactory getBrokerFactory(){
        return brokerFactory;
    }
    
    @Override 
    public abstract T execute(); 
    
}
