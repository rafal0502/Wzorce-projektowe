/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obserwator;

/**
 *
 * @author rafal
 */

import java.util.Observable;
import java.util.Observer;




public class WarunkiBieżąceWyświetl implements Observer, WyświetlElement{
    Observable observable;
    private float temperatura;
    private float wilgotność;
    

    public WarunkiBieżąceWyświetl (Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    public void update (Observable obs, Object arg)
    {
        if (obs instanceof DanePogodowe)
        {
            DanePogodowe danePogodowe = (DanePogodowe)obs;
            this.temperatura = danePogodowe.pobierzTemperaturę();
            this.wilgotność = danePogodowe.pobierzWilgotność();
            wyświetl();
        }
    }
    
    public void wyświetl() 
    {
        System.out.println("Warunki bieżące" + temperatura + "stopni C oraz" + wilgotność
        + "%wilgotność");
    }
    
    
    
}
