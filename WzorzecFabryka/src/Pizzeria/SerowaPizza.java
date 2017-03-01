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
public class SerowaPizza extends Pizza{
    FabrykaSkładnikówPizzy fabrykaSkładników;
    
    public SerowaPizza(FabrykaSkładnikówPizzy fabrykaSkładników) {
        this.fabrykaSkładników = fabrykaSkładników;
    }
    
    
    void przygotowanie(){
        System.out.println("Przygotowanie:" + nazwa);
        ciasto = fabrykaSkładników.utwórzSos();
        sos = fabrykaSkładników.utwórzSos();
        ser = fabrykaSkładników.utwórzSer();
    }
    
    
}
