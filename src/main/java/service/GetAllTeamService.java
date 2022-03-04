/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Teams;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllTeamService {
    public List<Teams> execute(){
        Teams team = new Teams();
        return team.getAllTeams();
    }
}
