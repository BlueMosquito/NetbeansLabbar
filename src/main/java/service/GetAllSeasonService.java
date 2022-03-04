/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Seasons;
import java.util.List;

/**
 *
 * @author hamednajafi
 */
public class GetAllSeasonService {

    public List<Seasons> execute() {
        Seasons season = new Seasons();
        return season.getAllSeasons();
    }

}
