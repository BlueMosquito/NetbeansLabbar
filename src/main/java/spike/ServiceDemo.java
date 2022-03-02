/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spike;

import domain.Games;
import domain.Leagues;
import domain.Seasons;
import java.util.List;
import service.GetAllGameService;
import service.GetAllLeagueService;
import service.GetAllSeasonService;

/**
 *
 * @author hamednajafi
 */
public class ServiceDemo {

    public static void main(String[] args) {
        //testGetAllLeagueService();
        //testGetAllSeasonService();
        testGetAllGameService();
        //testGetAllTeamService();
        //testGetAllArenaService();
        //testGetAllSeasonByLeagueService();
        //testGetAllArenaByGameIdService();
        //testCreateNewSeasonService();
        
    }
    
    public static void testGetAllLeagueService(){
        GetAllLeagueService getAllLeagueService = new GetAllLeagueService();

        List<Leagues> leaguesList = getAllLeagueService.execute();

        for (Leagues league : leaguesList) {
            System.out.println(league.getName());
        }
    }

    private static void testGetAllSeasonService() {
        GetAllSeasonService getAllSeasonService = new GetAllSeasonService();
        
        List<Seasons> seasonsList = getAllSeasonService.execute();
        
        for(Seasons season : seasonsList){
            System.out.println(season.getName());
        }
    }

    private static void testGetAllGameService() {
        GetAllGameService getAllGameService = new GetAllGameService();
        
        List<Games> gameList = getAllGameService.execute();
        
        for(Games game : gameList){
            System.out.println(game.getGameName());
        }
    }

    private static void testGetAllTeamService() {
        
    }

    private static void testGetAllArenaService() {
        
    }

    private static void testGetAllSeasonByLeagueService() {
        
    }

    private static void testGetAllArenaByGameIdService() {

    }

    private static void testCreateNewSeasonService() {
        
    }


}
