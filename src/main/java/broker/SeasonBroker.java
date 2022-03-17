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

    long seasonId, leagueId;
    String name;
    boolean usedName = false;

    public List<Seasons> findAll() {
        return SeasonsRecord.findAll().stream()
                .map(rec -> new Seasons((SeasonsRecord) rec))
                .collect(Collectors.toList());
    }

    public Seasons findById(long seasonId) {
        return new Seasons(SeasonsRecord.findById(seasonId));
    }

    public List<Seasons> findAllSeasonByLeagueId(long leagueId) {
        List<SeasonsRecord> seasonR = SeasonsRecord.findById(leagueId);
        return seasonR.stream().map(rec -> new Seasons((SeasonsRecord) rec))
                .collect(Collectors.toList());
    }

    public Seasons createNewSeason(long leagueId, String name) {
        this.leagueId = leagueId;
        this.name = name;
        SeasonsRecord record = new SeasonsRecord();
        if (!usedName) {
            record.set("league_id", leagueId);
            record.set("seasonName", name);
            record.saveIt();
        }

        Seasons season = new Seasons(record);
        return season;
    }

    //Så jag vet inte om det fattar att med namn menar jag just namn kolumnen
    //i databasen, om det inte fattar det så måste man ta fram alla namn och
    //gör en loop och checkar varje namn med det som användaren anger!!!
    public boolean checkName(String name) {
        this.name = name;
        List<SeasonsRecord> seasonR = SeasonsRecord.findById(leagueId);
        if (seasonR.stream().map(rec -> new Seasons((SeasonsRecord) rec))
                .collect(Collectors.toList()).contains(name)) {
            usedName = true;
        }
        return usedName;
    }

}
