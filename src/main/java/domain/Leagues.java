/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import records.LeaguesRecord;

/**
 *
 * @author hamednajafi
 */

public class Leagues {
    
    private final LeaguesRecord theR;
    
    public Leagues(){
        this(new LeaguesRecord());
        
    }
    
    public Leagues(LeaguesRecord theR){
        this.theR = theR;
    }
            
    public String getName(){
        return theR.getString("leagueName");
    }
    
}
