/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class ProgramowaniePilota2 {
    
    public static void main(String[] args)
    {
        SuperPilot pilot  = new SuperPilot();
        
        Światło jadalniaŚwiatło  = new Światło ("Jadalnia");
        
        PolecenieWłączŚwiatło jadalniaWłączŚwiatło = new PolecenieWłączŚwiatło(jadalniaŚwiatło);
        PolecenieWyłączŚwiatło jadalniaWyłączŚwiatło = new PolecenieWyłączŚwiatło(jadalniaŚwiatło);
        
        pilot.ustawPolecenie(0, jadalniaWłączŚwiatło, jadalniaWyłączŚwiatło);
        
        
        pilot.wciśniętoPrzyciskWłącz(0);
        pilot.wciśniętoPrzyciskWyłącz(0);
        System.out.println(pilot);
        pilot.wciśniętoPrzyciskWycofaj();
        pilot.wciśniętoPrzyciskWyłącz(0);
        pilot.wciśniętoPrzyciskWłącz(0);
        System.out.println(pilot);
        pilot.wciśniętoPrzyciskWycofaj();
                
        
    }
    
    
}
