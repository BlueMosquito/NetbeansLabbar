/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Informations;
import java.util.List;
import java.util.stream.Collectors;
import records.InformationsRecord;

/**
 *
 * @author hamednajafi
 */
public class GetAllArenaByGameIdService {
    
    int gameId;

    public GetAllArenaByGameIdService(int gameId) {
        this.gameId = gameId;
    }
    
    public List<Informations> execute() {

        List<InformationsRecord> gamesRecordList = InformationsRecord.find("game_id = ?", gameId);
        
        return gamesRecordList.stream().map((r)-> new Informations(r)).collect(Collectors.toList());
    }
}
