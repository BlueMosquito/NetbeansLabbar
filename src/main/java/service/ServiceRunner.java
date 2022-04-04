package service;


import db.DbConn;
import factory.BrokerFactory;
import interfaces.LeaguestatsService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hamednajafi
 */
public class ServiceRunner<T> {
    
    private final LeaguestatsService<T> service; 
     
    public ServiceRunner(LeaguestatsService<T> service) { 
        this.service = service; 
    } 
     
    public T execute() {
        
        DbConn dbConn = DbConn.getInstance(); 
        service.init(new BrokerFactory());
        dbConn.open();
        T result = service.execute();
        dbConn.close();
        return result; 
    } 
}
