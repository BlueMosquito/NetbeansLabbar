/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Informations;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllArenaByGameIdService {
    
    long gameId;

    public GetAllArenaByGameIdService(long gameId) {
        this.gameId = gameId;
    }
    
    public List<Informations> execute() {
        Informations season = new Informations();
        return season.getAllArenaById(gameId);
    }
}
