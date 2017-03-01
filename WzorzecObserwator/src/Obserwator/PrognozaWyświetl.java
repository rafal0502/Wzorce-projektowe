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

public class PrognozaWyświetl implements Observer, WyświetlElemenent 
{
    
    private float bieżąceCiśnienie = 1010.1f;
    private float ostatnieCiśnienie;
   
    public PrognozaWyświetl(Observable observable)
    {
    DanePogodowe danePogodowe = (DanePogodowe) observable;
    observable.addObserver(this);
    }
    
    public void update(Observable observable, Object arg)
    {
        if(observable instanceof DanePogodowe)
        {
            ostatnieCiśnienie = bieżąceCiśnienie;
            bieżąceCiśnienie = DanePogodowe.pobierzCiśnienie();
            wyświetl();
        }
    }
    
        public void wyświetl(){
            //kod metody wyświetl
        }
}
