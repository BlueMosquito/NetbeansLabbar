/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import factory.BrokerFactory;

/**
 *
 * @author hamednajafi
 */
public interface LeaguestatsService<T> {
    
    public void init(BrokerFactory brokerFactory);
    public T execute();
}