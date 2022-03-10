/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Seasons;

/**
 *
 * @author hamednajafi
 */
public class CreateNewSeasonService {
    
    private long leage;
    private String name;

    public CreateNewSeasonService(long leage, String name) {
        this.leage = leage;
        this.name = name;
    }
    
    
    public void execute(){
        Seasons season = new Seasons();
        season.createNewSeason(leage, name);
    }
}
