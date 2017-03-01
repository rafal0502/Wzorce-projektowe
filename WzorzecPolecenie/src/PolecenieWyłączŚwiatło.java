/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class PolecenieWyłączŚwiatło implements Polecenie {
    Światło światło;
    
    public PolecenieWyłączŚwiatło(Światło światło){
        this.światło = światło;
    }
    
    
    public void wykonaj()
    {
        światło.wyłącz();
    }
    
    public void wycofaj()
    {
        światło.włącz();
    }
}
