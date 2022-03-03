/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import records.InformationsRecord;

/**
 *
 * @author hamednajafi
 */
public class Informations {
    
    InformationsRecord theR;
    
    public Informations(){
        this(new InformationsRecord());
    }
    
    public Informations(InformationsRecord theR){
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
