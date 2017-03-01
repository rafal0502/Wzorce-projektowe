/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzeria;

import java.util.*;

/**
 *
 * @author rafal
 */
public abstract class Pizza {
    String nazwa;
    Ciasto ciasto;
    Sos sos;
    Warzywa warzywa[];
    Ser ser;
    Pepperoni pepperoni;
    Małże małże;
   
    abstract void przygotowanie();
    
    void przygotowanie()
    {
        System.out.println("Przygotowanie: " + nazwa);
        System.out.println("Wyrabianie ciasta...");
        System.out.println("Dodawanie sosu...");
        System.out.println("Dodatki: ");
        for(int i = 0 ; i < dodatki.size(); i++)
        {
            System.out.println(" " + dodatki.get(i));
        }
    }
   
        void pieczenie()
        {
         System.out.println("Pieczenie : 25 minut"
                + "w temperaturze 350 stopni Celsjusza");
        }
        void krojenie()
        {
        System.out.println("Krojenie pizzy na 8 kawałków");
        }
        void pakowanie()
        {
        System.out.println("Pakowanie pizzy w oficjalne pudełko naszej sieci Pizzeri.");
        }
        
        void ustawNazwa(String nazwa){
            this.nazwa = nazwa;
        }
        
        
        public String pobierzNazwa(){
            return nazwa;
        }
        
        public String toString(){
          return  System.out.println(nazwa + ","  + ciasto + "," + sos + "," + ser);
        }

    private static class Ciasto {

        
    }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    
