/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Seasons;
import java.util.List;
import records.SeasonsRecord;

/**
 *
 * @author hamednajafi
 */
public class CreateNewSeasonService {
    
    private long leage;
    private String name;

    public CreateNewSeasonService(long leage, String name) {
        this.leage = leage;
        this.name = name;
    }
    
    
    public void execute(){
        
        DbConn.getInstance().open();
        
        SeasonsRecord record = new SeasonsRecord();
        record.set("league_id", leage);
        record.set("seasonName", name);
        record.saveIt();
        
        System.out.println(leage + name);
        
        DbConn.getInstance().close();
        
        //return record;
    }
}
