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
public class OwoceMorzaPizza extends Pizza{
    FabrykaSkładnikówPizzy fabrykaSkładników;
    
    public OwoceMorzaPizza(FabrykaSkładnikówPizzy fabrykaSkładników){
        this.fabrykaSkładników = fabrykaSkładników;
    }
    @Override
    void przygotowanie(){
        System.out.println("Przygotowanie: " + nazwa);
        ciasto = fabrykaSkładników.utwórzCiasto();
        sos = fabrykaSkładników.utwórzSos();
        ser = fabrykaSkładników.utwórzSer();
        małże = fabrykaSkładników.utwórzMałże();
    }
}
