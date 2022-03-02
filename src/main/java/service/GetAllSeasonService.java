/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Seasons;
import java.util.ArrayList;
import java.util.List;
import records.seasonsRecord;

/**
 *
 * @author hamednajafi
 */
public class GetAllSeasonService {

    public List<Seasons> execute() {
        DbConn._open();
        List<seasonsRecord> seasonRecordList = seasonsRecord.findAll();
        
        List<Seasons> seasonList = new ArrayList();
        for(seasonsRecord record : seasonRecordList){
            seasonList.add(new Seasons(record));
        }
        DbConn._close();
        return seasonList;
    }

}
