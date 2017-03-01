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
public class StarCafeSpecial extends Napój {
    public StarCafeSpecial()
    {
        opis = "Kawa Star Cafe Special";
    }
    @Override
    public double koszt()
    {
        return 0.89;
    }
}
