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
public class Bezkofeinowa extends Napój{
    public Bezkofeinowa()
    {
        opis = "Kawa Bezkofeinowa";
    }
    
    public double koszt()
    {
        return 1.05;
    }
}
