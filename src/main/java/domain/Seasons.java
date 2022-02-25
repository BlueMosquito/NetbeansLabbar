/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import records.seasonsRecord;

/**
 *
 * @author hamednajafi
 */
public class Seasons {
    
    private final seasonsRecord theR;
    
    public Seasons(){
        this(new seasonsRecord());
    }
    
    public Seasons(seasonsRecord theR){
        this.theR = theR;
    }
    
    public String getName(){
        return theR.getString("seasonName");
    }
    
    public Integer getLeagueId(){
        return theR.getInteger("league_id");
    }
    
}
