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
public class AmerykańskaSerowaPizza extends Pizza {
    
    public AmerykańskaSerowaPizza()
    {
        nazwa = "Amerykańska Pizza Serowa";
        ciasto = "Extra grube, chrupkie ciasto";
        sos = "Sos z pomidorów śliwkowych";
        
        dodatki.add("Grubo tarty ser Mozzarella");
    }
    
    @Override
     void krojenie()
     {
         System.out.println("Krojenie pizzy na kwadratowe kawałki");
     }
}






