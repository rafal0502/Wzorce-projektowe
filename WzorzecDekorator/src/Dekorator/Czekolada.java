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
public class Czekolada extends SkładnikDekorator{
    Napój napój;
    
    public Czekolada(Napój napój)
    {
        this.napój = napój;
    }
    
    public String pobierzOpis()
    {
        return napój.pobierzOpis() + ", Czekolada";
    }
    
    public double koszt()
    {
        return napój.koszt() + 0.20;
    }
}
