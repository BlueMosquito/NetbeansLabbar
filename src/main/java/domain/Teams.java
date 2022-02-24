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
public class Teams extends Model{
    public Integer getGameId(){
        return getInteger("g_id");
    }
    public String getTeamName(){
        return getString("teamName");
    }
}
