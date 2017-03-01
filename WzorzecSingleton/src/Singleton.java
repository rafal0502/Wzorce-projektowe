/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class Singleton {
    
    private static Singleton unikalnaInstancja;
    
    private Singleton(){}
    
    public static Singleton pobierzInstancję() {
        if (unikalnaInstancja == null){
            unikalnaInstancja = new Singleton();
        }
        return unikalnaInstancja;
    }
    
    
    
        
}
