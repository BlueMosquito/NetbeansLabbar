/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Games;
import java.util.List;
import java.util.stream.Collectors;
import records.GamesRecord;

/**
 *
 * @author hamednajafi
 */
public class GetAllGameService {
    public List<Games> execute(){
        
        List<GamesRecord> gameRecordList = GamesRecord.findAll();

        return gameRecordList.stream().map((r)-> new Games(r)).collect(Collectors.toList());
    }
}
