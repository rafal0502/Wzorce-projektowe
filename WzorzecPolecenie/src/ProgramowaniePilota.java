/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class ProgramowaniePilota {
    
    public static void main(String[] args){
        SuperPilot pilot = new SuperPilot();
        
        Światło jadalniaŚwiatło = new Światło("Jadalnia");
        Światło kuchniaŚwiatło = new Światło("Kuchnia");
        WentylatorSufitowy wentylatorSufitowy = new WentylatorSufitowy("Jadalnia");
        DrzwiGarażowe drzwiGarażowe = new DrzwiGarażowe("");
        WieżaStereo wieżaStereo = new WieżaStereo("Jadalnia");
        
        PolecenieWłączŚwiatło jadalniaWłączŚwiatło = new PolecenieWłączŚwiatło(jadalniaŚwiatło);
        PolecenieWyłączŚwiatło jadalniaWyłączŚwiatło = new PolecenieWyłączŚwiatło(jadalniaŚwiatło);
        PolecenieWłączŚwiatło kuchniaWłączŚwiatło = new PolecenieWłączŚwiatło(kuchniaŚwiatło);
        PolecenieWyłączŚwiatło kuchniaWyłączŚwiatło = new PolecenieWyłączŚwiatło(kuchniaŚwiatło);
        
        
        PolecenieWłączWentylatorSufitowy włączWentylatorSufitowy = new PolecenieWłączWentylatorSufitowy(wentylatorSufitowy);
        PolecenieWyłączWentylatorSufitowy wyłączWentylatorSufitowy = new PolecenieWyłączWentylatorSufitowy(wentylatorSufitowy);
        
        PolecenieOtwórzDrzwiGarażowe otwórzDrzwiGarażowe = new PolecenieOtwórzDrzwiGarażowe(drzwiGarażowe);
        PolecenieZamknijDrzwiGarażowe zamknijDrzwiGarażowe = new PolecenieZamknijDrzwiGarażowe(drzwiGarażowe);
        
        PolecenieWieżaStereoWłączCD wieżaStereoWłączCD = new PolecenieWieżaStereoWłączCD(wieżaStereo);
        PolecenieWyłączWieżaStereo wyłączWieżaStereo = new PolecenieWyłączWieżaStereo(wieżaStereo);
        
        pilot.ustawPolecenie(0, jadalniaWłączŚwiatło, jadalniaWyłączŚwiatło);
        pilot.ustawPolecenie(1, kuchniaWłączŚwiatło,kuchniaWyłączŚwiatło);
        pilot.ustawPolecenie(2, włączWentylatorSufitowy, wyłączWentylatorSufitowy);
        pilot.ustawPolecenie(3, wieżaStereoWłączCD, (Polecenie) wyłączWieżaStereo);
        
        System.out.println(pilot);
        
        pilot.wciśniętoPrzyciskWłącz(0);
        pilot.wciśniętoPrzyciskWyłącz(0);
        pilot.wciśniętoPrzyciskWłącz(1);
        pilot.wciśniętoPrzyciskWyłącz(1);
        pilot.wciśniętoPrzyciskWłącz(2);
        pilot.wciśniętoPrzyciskWyłącz(2);
        pilot.wciśniętoPrzyciskWłącz(3);
        pilot.wciśniętoPrzyciskWyłącz(3);      
    }
}
