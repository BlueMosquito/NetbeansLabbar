/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import domain.Informations;
import java.util.List;
import java.util.stream.Collectors;
import records.InformationsRecord;

/**
 *
 * @author hamednajafi
 */
public class InformationBroker {
    
    public List<Informations> findAll(){
        List<InformationsRecord> informationRecordList = InformationsRecord.findAll();
        return informationRecordList.stream().map(r -> new Informations(r)).collect(Collectors.toList());
    }
    
    public Informations findById(long gameId){
        return new Informations(InformationsRecord.findById(gameId));
    }
}
