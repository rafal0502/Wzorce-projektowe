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
public class AmerykańskaFabrykaSkładnikówPizzy implements FabrykaSkładnikówPizzy {
    public Ciasto utwórzCiasto(){
        return new GrubeChrupkieCiasto();
    }
    
    public Sos utwórzSos(){
        return new SosPomidorowy();
    }
    
    public Ser utwórzSer(){
        return new SerMozzarella());
    }
    
    public Warzywa[] utwórzWarzywa(){
        Warzywa warzywa[] = {new Szpinak(), new Bakłażan(), new CzarneOliwki(), 
       
    }
    
    public Pepperoni utwórzPepperoni(){
        return new PlastryPepperoni();
    }
    
    public Małże utwórzMałże(){
        return new MrożoneMałże();
    }
   
}
