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
public class CreateNewSeasonService extends BaseService{
    
    private final long leageId;
    private final String name;
    
    
    public CreateNewSeasonService(long leageId, String name) {
        this.leageId = leageId;
        this.name = name;
    }
    
    /**
     *
     * @return
     */
    @Override
    public Seasons execute(){
        
        Seasons season = getBrokerFactory().getSeasonFactory()
                .createNewSeason(leageId, name);
        
        return season;
    }
    
}