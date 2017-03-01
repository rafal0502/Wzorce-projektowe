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
public class MocnoPalona extends Napój {
    public MocnoPalona()
    {
        opis = "Kawa Mocno Palona";
    }
    
    @Override
    public double koszt()
    {
        return 0.99;
    }
}
