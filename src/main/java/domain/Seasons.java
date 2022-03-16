/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;
import java.util.stream.Collectors;
import records.SeasonsRecord;

/**
 *
 * @author hamednajafi
 */
public class Seasons {
    
    long seasonId, leagueId;
    String name;
    
    private final SeasonsRecord theR;
    
    public Seasons(){
        this(new SeasonsRecord());
    }
    
    public Seasons(SeasonsRecord theR){
        this.theR = theR;
    }
    
    public String getName(){
        return theR.getString("seasonName");
    }
    
    public Integer getLeagueId(){
        return theR.getInteger("league_id");
    }
    
    public List<Seasons> getAllSeasons(){
        List<SeasonsRecord> seasonRecordList = SeasonsRecord.findAll();
        return seasonRecordList.stream().map((r)-> new Seasons(r)).collect(Collectors.toList());
    }
    
    public List<Seasons> getSeasonsById(long seasonId){
        this.seasonId = seasonId;
        List<SeasonsRecord> seasonRecordList = SeasonsRecord.find("league_id = ?", seasonId);
        return seasonRecordList.stream().map((r)-> new Seasons(r)).collect(Collectors.toList());
    }
    
    public void createNewSeason(long leagueId, String name){
        this.leagueId = leagueId;
        this.name = name;
        
        SeasonsRecord record = new SeasonsRecord();
        record.set("league_id", leagueId);
        record.set("seasonName", name);
        record.saveIt();
    }
    
}
