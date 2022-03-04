/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Seasons;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllSeasonByLeagueIdService {
    
    long seasonId;

    public GetAllSeasonByLeagueIdService(long seasonId) {
        this.seasonId = seasonId;
    }
    
    public List<Seasons> execute() {
        Seasons season = new Seasons();
        return season.getSeasonsById(seasonId);
    }
}
