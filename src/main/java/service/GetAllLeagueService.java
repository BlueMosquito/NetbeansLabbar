/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Leagues;
import java.util.ArrayList;
import java.util.List;
import records.LeaguesRecord;

/**
 *
 * @author hamednajafi
 */
public class GetAllLeagueService {
    public List<Leagues> execute(){
        DbConn._open();
        List<LeaguesRecord> leaguesRecordList = LeaguesRecord.findAll();
        
        List<Leagues> leaguesList = new ArrayList();
        for(LeaguesRecord record : leaguesRecordList){
            leaguesList.add(new Leagues(record));
        }
        
        DbConn._close();
        return leaguesList;
    }
}
