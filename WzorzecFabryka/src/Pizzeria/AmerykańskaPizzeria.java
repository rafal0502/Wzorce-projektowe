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
public class AmerykańskaPizzeria extends Pizzeria{
     protected Pizza utwórzPizza (String item)
           {
               if(item.equals("serowa")){
                   return new AmerykańskaSerowaPizza();
               } else if (item.equals("wegetariańska")){
                   pizza = new AmerykańskaWegetariańskaPizza();
               } else if (item.equals("owoce morza")){
                  pizza = new AmerykańskaOwoceMorzaPizza();
               } else if (item.equals("pepperoni")) {
                   pizza = new AmerykańskaPepperoniPizza();
               } else return null;
           }
}
