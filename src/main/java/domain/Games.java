/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import records.GamesRecord;

/**
 *
 * @author hamednajafi
 */
public class Games {
    
    private final GamesRecord theR;
    
    public Games(){
        this(new GamesRecord());
    }
    
    public Games(GamesRecord theR){
        this.theR = theR;
    }
    
   public Integer getSeason(){
       return theR.getInteger("season_id");
   }
   
   public String getGameName(){
       return theR.getString("gameName");
   }  
}
