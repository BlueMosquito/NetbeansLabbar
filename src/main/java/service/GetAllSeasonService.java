/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Seasons;
import java.util.List;
import java.util.stream.Collectors;
import records.SeasonsRecord;

/**
 *
 * @author hamednajafi
 */
public class GetAllSeasonService {

    public List<Seasons> execute() {
        
        
        List<SeasonsRecord> seasonRecordList = SeasonsRecord.findAll();
        
        return seasonRecordList.stream().map((r)-> new Seasons(r)).collect(Collectors.toList());
        
    }

}
