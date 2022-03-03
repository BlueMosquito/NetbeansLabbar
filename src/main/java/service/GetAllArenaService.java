/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import db.DbConn;
import domain.Informations;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import records.InformationsRecord;

/**
 *
 * @author hamednajafi
 */
public class GetAllArenaService {
    public List<Informations> execute(){
        
        List<InformationsRecord> arenaRecordList = InformationsRecord.findAll();
        
        return arenaRecordList.stream().map((r)-> new Informations(r)).collect(Collectors.toList());
 
    }
}
