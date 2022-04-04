/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spike;

import service.ServiceRunner;
import db.DbConn;
import domain.Games;
import domain.Informations;
import domain.Leagues;
import domain.Seasons;
import domain.Teams;
import java.util.List;
import java.util.stream.Stream;
import service.CreateNewSeasonService;
import service.GetAllArenaService;
import service.GetAllGameService;
import service.GetAllLeagueService;
import service.GetAllSeasonByLeagueIdService;
import service.GetAllSeasonService;
import service.GetAllTeamService;
import service.GetAllArenaByGameIdService;

/**
 *
 * @author hamednajafi
 */
public class ServiceDemo {

    public static void main(String[] args) {
        
        testGetAllLeagueService();
        //testGetAllSeasonService();
        //testGetAllGameService();
        //testGetAllTeamService();
        //testGetAllArenaService();
        //testGetAllSeasonByLeagueIdService();
        //testGetAllArenaByGameIdService();
        //testCreateNewSeasonService();
        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9)
                .filter(n -> n % 2 > 0).reduce(Integer::sum));
        
    }
    
    public static void testGetAllLeagueService(){
        
        ServiceRunner<List<Leagues>> runner = new ServiceRunner<>(new GetAllLeagueService());
        
        List<Leagues> leaguesList = runner.execute();

        for (Leagues league : leaguesList) {
            System.out.println(league.getName());
        }
    }

    private static void testGetAllSeasonService() {
        DbConn.getInstance().open();
        GetAllSeasonService getAllSeasonService = new GetAllSeasonService();
        
        List<Seasons> seasonsList = getAllSeasonService.execute();
        
        for(Seasons season : seasonsList){
            System.out.println(season.getName());
        }
        DbConn.getInstance().close();
    }

    private static void testGetAllGameService() {
        DbConn.getInstance().open();
        GetAllGameService getAllGameService = new GetAllGameService();
        
        List<Games> gameList = getAllGameService.execute();
        
        for(Games game : gameList){
            System.out.println(game.getGameName());
        }
        DbConn.getInstance().close();
    }

    private static void testGetAllTeamService() {
        DbConn.getInstance().open();
        GetAllTeamService getAllTeamService = new GetAllTeamService();
        
        List<Teams> teamList = getAllTeamService.execute();
        
        for(Teams team : teamList){
            System.out.println(team.getTeamName());
        }
        DbConn.getInstance().close();
    }

    private static void testGetAllArenaService() {
        DbConn.getInstance().open();
        GetAllArenaService getAllArenaService = new GetAllArenaService();
        
        List<Informations> arenaList = getAllArenaService.execute();
        
        for(Informations arena : arenaList){
            System.out.println(arena.getArenaName());
        }
        DbConn.getInstance().close();
    }

    private static void testGetAllSeasonByLeagueIdService() {
        DbConn.getInstance().open();
        GetAllSeasonByLeagueIdService getSeasonService = new GetAllSeasonByLeagueIdService(1);
        
        List<Seasons> seasonList = getSeasonService.execute();
        
        for(Seasons season : seasonList){
            System.out.println(season.getName());
        }
        DbConn.getInstance().close();
    }

//    private static void testGetAllArenaByGameIdService() {
//        DbConn.getInstance().open();
//        
//        GetAllArenaByGameIdService getArenaService = new GetAllArenaByGameIdService(2);
//        List<Informations> arenaList = getArenaService.execute();
//        
//        for(Informations arena : arenaList){
//            System.out.println(arena.getArenaName());
//        }
//        
//        DbConn.getInstance().close();
//    }

    private static void testCreateNewSeasonService() {
        DbConn.getInstance().open();
        CreateNewSeasonService season = new CreateNewSeasonService(23, "blaablaa");
        season.execute();
        DbConn.getInstance().close();
    }
}