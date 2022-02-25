/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import records.informationsRecord;

/**
 *
 * @author hamednajafi
 */
public class Informations {
    
    informationsRecord theR;
    
    public Informations(){
        this(new informationsRecord());
    }
    
    public Informations(informationsRecord theR){
        this.theR = theR;
    }
    
   public Integer getGameId(){
       return theR.getInteger("game_id");
   }
    
   public String getPlaceName(){
       return theR.getString("place");
   }
   
   public String getArenaName(){
       return theR.getString("arena");
   }
    
}
