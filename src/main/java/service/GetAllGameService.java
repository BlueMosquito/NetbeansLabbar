/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Games;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllGameService {
    public List<Games> execute(){
        Games game = new Games();
        return game.getAllGames();
    }
}
