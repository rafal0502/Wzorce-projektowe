/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class PolecenieWyłączWieżaStereo implements Polecenie {
     WieżaStereo wieżaStereo;
    
    public PolecenieWyłączWieżaStereo(WieżaStereo wieżaStereo)
    {
        this.wieżaStereo = wieżaStereo;
    }
    public void wykonaj()
    {
        wieżaStereo.wyłącz();
    }
    
    public void wycofaj(){}
}
