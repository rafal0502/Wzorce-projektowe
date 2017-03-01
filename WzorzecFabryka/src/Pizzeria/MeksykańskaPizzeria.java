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
public class MeksykańskaPizzeria {
     protected Pizza utwórzPizza (String item)
           {
               if(item.equals("serowa")){
                   return new MeksykańskaSerowaPizza();
               } else if (item.equals("wegetariańska")){
                   pizza =  new MeksykańskaWegetariańskaPizza();
               } else if (item.equals("owoce morza")){
                   pizza =  new MeksykańskaOwoceMorzaPizza();
               } else if (item.equals("pepperoni")){
                   pizza = new MeksykańskaPepperoniPizza();
               } else return null;
           }
} 
