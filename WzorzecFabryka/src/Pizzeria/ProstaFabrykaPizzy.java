/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzeria;

/**
 *
 * @author rafal
 */
public class ProstaFabrykaPizzy {
    public Pizza utwórzPizza(String type)
    {
        Pizza pizza = null;
        
        if(type.equals("serowa"))
        {
            pizza = new SerowaPizza();
        }else if(type.equals("pepperoni"))
        {
            pizza = new PepperoniPizza();
        }else if(type.equals("wegetariańska"))
        {
            pizza = new WegetariańskaPizza();
        }
            return pizza;
          
    }
}
