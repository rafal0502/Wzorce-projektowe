/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class PolecenieWłączWentylatorSufitowy implements Polecenie{
    WentylatorSufitowy wentylatorSufitowy = new WentylatorSufitowy();
    
    public PolecenieWłączWentylatorSufitowy(WentylatorSufitowy wentylatorSufitowy)
    {
        this.wentylatorSufitowy = wentylatorSufitowy;
    }
    
    public void wykonaj()
    {
        wentylatorSufitowy.niskieObroty();
        wentylatorSufitowy.średnieObroty();
        wentylatorSufitowy.wysokieObroty();
    }
    public void wycofaj(){}
}
