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
public class PizzaTest {
    
    public static void main(String[] args)
    {
        Pizzeria włoska = new WłoskaPizzeria();
        Pizzeria amerykańska = new AmerykańskaPizzeria();
        
        Pizza pizza = włoska.zamówPizza("serowa");
        System.out.println("Eryk zamówił: " + pizza.pobierzNazwa() + "\n");
        
        pizza = amerykańska.zamówPizza("serowa");
        System.out.println("Jacek zamówił: " + pizza.pobierzNazwa() + "\n");
    }
}
