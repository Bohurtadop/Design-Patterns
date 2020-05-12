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
public class FastFoodFactory {

    public FastFood getFastFood(String type) {
        switch (type) {
            case "hamburguer":
                return new Hamburguer();
            case "sandwich":
                return new Sandwich();
            case "hot dog":
                return new HotDog();
            default:
                return null;
        }
    }
}
