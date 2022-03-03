/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Seasons;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import records.SeasonsRecord;

/**
 *
 * @author hamednajafi
 */
public class GetAllSeasonByLeagueIdService {

    public List<Seasons> execute() {

        List<SeasonsRecord> seasonRecordList = SeasonsRecord.find("league_id = ?", 2);
        
        return seasonRecordList.stream().map((r)-> new Seasons(r)).collect(Collectors.toList());
    }
}
