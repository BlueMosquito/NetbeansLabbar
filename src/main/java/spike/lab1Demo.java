/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spike;

import db.DbConn;
import domain.Informations;
import domain.Games;
import domain.Leagues;
import domain.Seasons;
import domain.Teams;
import java.util.List;
import records.TeamsRecord;

/**
 *
 * @author hamednajafi
 */
public class lab1Demo {
    public static void main(String[] args){
        DbConn dbCon = DbConn.getInstance();
        dbCon.open();
        
        /*
        Leagues l = new Leagues();
        l.saveIt();
        
        l.set("leagueName", "league55");
        l.saveIt();
        
        //new Leagues().add(new Seasons());
        
        Seasons s = new Seasons();
        s.saveIt();
        
        l.add(s);
        */
        

        //leaguesTable();
        //seasonsTable();
        //gamesTable();
        //gameInfoTable();
        //teamTable();
        
        
        //printData();
        
        dbCon.close();
    }
    
    /*
    public static void printData(){
       
        List<Leagues> leaguesN = Leagues.findAll();
        for(Leagues l : leaguesN){
            System.out.printf("League id: %d, League name: %s%n", l.getId(), l.getName());
        }
        
        List<Seasons> seasonsN = Seasons.findAll();
        for(Seasons s : seasonsN){
            System.out.printf("League id: %d, Season name: %s, Season id: %d%n",
                    s.getLeagueId(), s.getName(), s.getId());
        }
          
        List<Games> gamesN = Games.findAll();
        for(Games g : gamesN){
            System.out.printf("Season id: %d, Games name: %s, Game id: %d%n",
                    g.getSeasonId(), g.getGameName(), g.getId());
        }
        
        List<Informations> lgameInfoN = Informations.findAll();
        for(Informations i : lgameInfoN){
            System.out.printf("Game id: %d, Place: %s , Arena: %s, Information id: %d%n",
                    i.getGameId(),i.getPlaceName() , i.getArenaName(), i.getId());
        }
        
        List<Teams> teamN = Teams.findAll();
        for(Teams t : teamN){
            System.out.printf("Game id: %d, Team name: %s, Team id: %d%n",
                    t.getGameId(), t.getTeamName(), t.getId());
        }
        
    }

    private static void leaguesTable() {
        //Leagues.createIt("leagueName", "leagueNr4").saveIt();
        Leagues.deleteAll();
    }
    
    private static void seasonsTable(int id) {
        //Seasons.createIt("league_id", "2" ,"seasonName", "seasonNr5").saveIt();
        Seasons s = Seasons.findById(1);
        System.out.printf(s.getName());
        
        
    }

    private static void gamesTable() {
        //Games.createIt("season_id", "1", "gameName", "GameNr1").saveIt();
        Games g = Games.findById(2);
        g.delete();
        
    }

    public static void gameInfoTable() {
        Informations.createIt("game_id", "1", "place", "SomeWhere...", "arena", "blablaArena").saveIt();
        //Informations.deleteAll();
    }

    public static void teamTable() {
        TeamsRecord.createIt("G_id", "1", "teamName", "blablaTeam").saveIt();
        //Teams.deleteAll();
    }
*/

}