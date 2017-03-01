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
public class MleczkoSojowe extends SkładnikDekorator{
      Napój napój;
    
    public MleczkoSojowe (Napój napój)
    {
        this.napój = napój;
    }
    
      @Override
    public String pobierzOpis()
    {
        return napój.pobierzOpis() + ", Mleczko sojowe";
    }
    
    public double koszt()
    {
        return napój.koszt() + 0.15;
    }
}

