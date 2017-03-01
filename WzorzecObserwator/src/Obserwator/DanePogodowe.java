/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obserwator;

import java.util.ArrayList;

/**
 *
 * @author rafal
 */
public class DanePogodowe implements Podmiot{
    private ArrayList obserwatorzy;
    private float temperatura;
    private float wilgotność;
    private float ciśnienie;
   


public DanePogodowe(){
    obserwatorzy= new ArrayList();
}

public void zarejestrujObserwatora(Obserwator o){
    obserwatorzy.add(o);
}

public void usuńObserwatora(Obserwator o)
{
    int i = obserwatorzy.indexOf(o);
    if( i >= 0)
    {
        obserwatorzy.remove(i);
    }
}


public void powiadomObserwatorów()
{
    for (int i = 0; i < obserwatorzy.size(); i++)
    {
        Obserwator Obs = (Obserwator)obserwatorzy.get(i);
        Obs.aktualizacja(temperatura, wilgotność, ciśnienie);
    }
}

public void odczytZmiana()
{
    powiadomObserwatorów();
}


public void ustawOdczyt(float temperatura,float wilgotność, float ciśnienie)
{
    this.temperatura = temperatura;
    this.wilgotność = wilgotność;
    this.ciśnienie = ciśnienie;
    odczytZmiana();
}

    @Override
    public void powiadomObserwatora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}