/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzeria;


public abstract class  Pizzeria {
    ProstaFabrykaPizzy fabryka;
   
    
    public Pizza zamówPizza(String type)
    {
        Pizza pizza;
        
        pizza = utwórzPizza(type);
        
        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();
        
        return pizza;
    }
        protected abstract Pizza utwórzPizza(String type);
        
}  
           
           
           
           
           
           
           
       
































        




