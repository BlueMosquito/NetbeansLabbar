/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domain.Informations;
import java.util.List;


/**
 *
 * @author hamednajafi
 */
public class GetAllArenaService {
    public List<Informations> execute(){
       Informations information = new Informations();
       return information.getAllArena();
    }
}
