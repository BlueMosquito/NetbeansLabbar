package service;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import db.DbConn;
import domain.Leagues;
import factory.BrokerFactory;
import interfaces.LeaguestatsService;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hamednajafi
 */
public class ServiceRunner<T> {
    
    private final LeaguestatsService<T> service; 
     
    public ServiceRunner(LeaguestatsService<T> service) { 
        this.service = service; 
    }
    
    public T execute() throws JsonProcessingException {
        
        DbConn dbConn = DbConn.getInstance(); 
        service.init(new BrokerFactory());
        T result = null;
        try{
            dbConn.open();
            //service.init(new BrokerFactory());
            //dbConn.open();
            result = service.execute();
        }catch(exception.ExceptionClass e){
            System.out.println(e);
        }
        finally{
            dbConn.close();
        }
        return result;
        
        /*
        //fixa JSON
        ServiceRunner<List<Leagues>> serviceRunner = new ServiceRunner(new GetAllLeagueService());
        List<Leagues> listOfLeagues = (List<Leagues>) serviceRunner;
        
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonLeague = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(listOfLeagues);
        dbConn.close();
        return result;
*/
    }
    
}
