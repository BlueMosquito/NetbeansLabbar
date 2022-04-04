/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Leagues;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllLeagueService extends BaseService<List<Leagues>>{

    long leagueId;

    @Override
    public List<Leagues> execute() {
        
        List<Leagues> league = getBrokerFactory().getLeagueFactory().findAll();

        if (league == null) {
            System.out.println("Nothing there!!!");
        }

        return league;
    }
}