/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class PolecenieWyłączWentylatorSufitowy implements Polecenie{
      WentylatorSufitowy wentylatorSufitowy;
    
    public PolecenieWyłączWentylatorSufitowy (WentylatorSufitowy wentylatorSufitowy)
    {
        this.wentylatorSufitowy = wentylatorSufitowy;
    }
    public void wykonaj()
    {
        wentylatorSufitowy.wyłącz();
    }

    public void wycofaj(){}
}
