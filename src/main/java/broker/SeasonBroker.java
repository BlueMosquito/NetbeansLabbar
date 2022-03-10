/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import domain.Seasons;
import java.util.List;
import java.util.stream.Collectors;
import records.SeasonsRecord;

/**
 *
 * @author hamednajafi
 */
public class SeasonBroker {
    public List<Seasons> findAll(){
        return SeasonsRecord.findAll().stream()
                .map(rec -> new Seasons((SeasonsRecord) rec))
                .collect(Collectors.toList());
    }
    
}
