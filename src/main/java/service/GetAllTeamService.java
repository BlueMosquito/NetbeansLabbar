/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Teams;
import java.util.ArrayList;
import java.util.List;
import records.TeamsRecord;

/**
 *
 * @author hamednajafi
 */
public class GetAllTeamService {
    public List<Teams> execute(){
        DbConn._open();
        List<TeamsRecord> teamRecordList = TeamsRecord.findAll();
        
        List<Teams> teamList = new ArrayList();
        for(TeamsRecord record : teamRecordList){
            teamList.add(new Teams(record));
        }
        DbConn._close();
        return teamList;
    }
}
