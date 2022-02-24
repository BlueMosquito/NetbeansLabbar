/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import org.javalite.activejdbc.Model;

/**
 *
 * @author hamednajafi
 */
public class Informations extends Model{
    
   public Integer getGameId(){
       return getInteger("game_id");
   }
    
   public String getPlaceName(){
       return getString("place");
   }
   
   public String getArenaName(){
       return getString("arena");
   }
    
}
