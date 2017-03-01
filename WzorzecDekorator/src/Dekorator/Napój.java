/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dekorator;

/**
 *
 * @author rafal
 */
public abstract class Napój {
    String opis = "Napój nieznany";
    
    public String pobierzOpis(){
        return opis;
    }
    
    public abstract double koszt();
}



