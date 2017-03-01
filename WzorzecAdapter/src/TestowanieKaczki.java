/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class TestowanieKaczki {
    public static void main (String[] args) {
        DzikaKaczka kaczka = new DzikaKaczka();
        
        DzikiIndyk indyk = new DzikiIndyk();
        Kaczka indykAdapter = new IndykAdapter(indyk);
        
        System.out.println("---- Indyk powiada tak....");
        indyk.gulgocz();
        indyk.lataj();
        
        System.out.println("\n---- Kaczka powiada tak...");
        testujKaczkę(kaczka);
        
        System.out.println("\n---- A IndykAdapter powiada tak...");
        testujKaczkę(indykAdapter);
        
    }
    
    static void testujKaczkę (Kaczka kaczka) 
    {
        kaczka.kwacz();
        kaczka.lataj();
    }
}
