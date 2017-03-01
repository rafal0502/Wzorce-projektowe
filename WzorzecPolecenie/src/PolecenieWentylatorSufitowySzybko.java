/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class PolecenieWentylatorSufitowySzybko implements Polecenie {
    WentylatorSufitowy wentylatorSufitowy;
    int poprzedniaSzybkość;
    
    public PolecenieWentylatorSufitowySzybko (WentylatorSufitowy wentylatorSufitowy)
    {
        this.wentylatorSufitowy = wentylatorSufitowy;
    }
    
    public void wykonaj()
    {
        poprzedniaSzybkość = wentylatorSufitowy.pobierzSzybkość();
        wentylatorSufitowy.wysokieObroty();
    }
    
    public void wycofaj()
    {
        if (poprzedniaSzybkość == WentylatorSufitowy.SZYBKO)
        {
            wentylatorSufitowy.średnieObroty();
        } else if (poprzedniaSzybkość == WentylatorSufitowy.ŚREDNIO)
        {
            wentylatorSufitowy.średnieObroty();
        } else if (poprzedniaSzybkość == WentylatorSufitowy.WOLNO)
        {
            wentylatorSufitowy.niskieObroty();
        } else if (poprzedniaSzybkość == WentylatorSufitowy.WYŁĄCZ) 
        {
            wentylatorSufitowy.wyłącz();
        }
    }
    
    
    
}
