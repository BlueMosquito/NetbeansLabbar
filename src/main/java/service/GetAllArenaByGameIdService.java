/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Informations;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllArenaByGameIdService extends BaseService<List<Informations>>{
    
    long gameId;
    
    public GetAllArenaByGameIdService(long gameId) {
        this.gameId = gameId;
    }
    
    @Override
    public List<Informations> execute() {
        
        List<Informations> info = getBrokerFactory().getInfoFactory().findAll();
        
        if (info == null) {
            System.out.println("Nothing there!!!");
        }
        
        return info;
    }
}