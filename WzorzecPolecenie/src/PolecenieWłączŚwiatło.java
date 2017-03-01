/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class PolecenieWłączŚwiatło implements Polecenie{
    Światło światło;
    
    public PolecenieWłączŚwiatło (Światło światło)
    {
        this.światło = światło;
    }
    public void wykonaj()
    {
        światło.włącz();
    }
    
    public void wycofaj()
    {
        światło.wyłącz();
    }
    
    
    
    
}
