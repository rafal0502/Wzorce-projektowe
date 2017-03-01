/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class PolecenieWieżaStereoWłączCD implements Polecenie{
    WieżaStereo wieżaStereo;
    
    public PolecenieWieżaStereoWłączCD(WieżaStereo wieżaStereo)
    {
        this.wieżaStereo = wieżaStereo;
    }
    public void wykonaj()
    {
        wieżaStereo.włącz();
        wieżaStereo.ustawCD();
        wieżaStereo.ustawGłośność(11);
    }
    
    public void wycofaj(){}
}
