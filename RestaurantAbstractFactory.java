/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

/**
 *
 * @author Brayan Hurtado
 */
public abstract class RestaurantAbstractFactory {
    public abstract FastFood getFastFood( String type );;
    public abstract Drink getDrink( String type );;
}
