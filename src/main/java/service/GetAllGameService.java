/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Games;
import java.util.ArrayList;
import java.util.List;
import records.gamesRecord;

/**
 *
 * @author hamednajafi
 */
public class GetAllGameService {
    public List<Games> execute(){
        DbConn._open();
        List<gamesRecord> gameRecordList = gamesRecord.findAll();
        
        List<Games> gameList = new ArrayList();
        for(gamesRecord record : gameRecordList){
            gameList.add(new Games(record));
        }
        DbConn._close();
        return gameList;
    }
}
