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
public class Seasons extends Model{
    
    public String getName(){
        return getString("seasonName");
    }
    
    public Integer getLeagueId(){
        return getInteger("league_id");
    }
    
}
