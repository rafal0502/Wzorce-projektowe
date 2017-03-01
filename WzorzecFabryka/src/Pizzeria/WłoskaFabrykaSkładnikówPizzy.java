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
public class WłoskaFabrykaSkładnikówPizzy implements FabrykaSkładnikówPizzy {
    public Ciasto utwórzCiasto(){
        return new CienkieChrupkieCiasto();
    }
    
    public Sos utwórzSos(){
        return new SosMarinara();
    }
    
    public Ser utwórzSer(){
        return new SerReggiano();
    }
    
    public Warzywa[] utwórzWarzywa(){
        Warzywa warzywa[] = {new Czosnek(), new Cebula(), new Pieczarki(), 
        new CzerwonaPapryka() };
    }
    
    public Pepperoni utwórzPepperoni(){
        return new PlastryPepperoni();
    }
    
    public Małże utwórzMałże(){
        return new ŚwieżeMałże();
    }
    
    
    
}
