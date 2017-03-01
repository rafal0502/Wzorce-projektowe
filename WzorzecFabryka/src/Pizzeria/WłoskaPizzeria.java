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



       public class WłoskaPizzeria extends Pizzeria {
           
           protected Pizza utwórzPizza(String item){
               Pizza pizza = null;
               FabrykaSkładnikówPizzy fabrykaSkładników = new WłoskaFabrykaSkładnikówPizzy();
               
        
               if(item.equals("serowa")){
                 
                   pizza = new SerowaPizza(fabrykaSkładników);
                   pizza.ustawNazwa("Włoska Pizza Serowa");
              
               } else if (item.equals("wegetariańska")){
                   
                   pizza = new WegetariańskaPizza(fabrykaSkładniów);
                   pizza.ustawNazwa("Włoska Pizza Wegetariańska");
                   
               } else if (item.equals("owoce morza")){
                   
                   pizza = new OwoceMorzaPizza(fabrykaSkładników);
                   pizza.ustawNazwa("Włoska Pizza Owoce Morza");
                   
               } else if (item.equals("pepperoni")){
                  
                   pizza = new PepperoniPizza(fabrykaSkładników);
                   pizza.ustawNazwa("Włoska Pizza Pepperoni");
                   
               } 
               return null;
           
       }
       }
         


