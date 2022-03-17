/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import domain.Leagues;
import java.util.List;
import java.util.stream.Collectors;
import records.LeaguesRecord;

/**
 *
 * @author hamednajafi
 */
public class LeagueBroker {
    public List<Leagues> findAll(){
        return LeaguesRecord.findAll().stream()
                .map(rec -> new Leagues((LeaguesRecord) rec))
                .collect(Collectors.toList());
    }
    
    public Leagues findById(long leagueId){
        return new Leagues(LeaguesRecord.findById(leagueId));
    }
    
    public Leagues create(String name){
        LeaguesRecord record = new LeaguesRecord()
                .set("leagueName", name);
        record.saveIt();
        return new Leagues(record);
    }
}
