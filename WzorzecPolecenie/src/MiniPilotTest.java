/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class MiniPilotTest {
    public static void main(String args[]){
        MiniPilot pilot = new MiniPilot();
        Światło światło = new Światło();
        DrzwiGarażowe drzwiGarażowe = new DrzwiGarażowe();
        PolecenieWłączŚwiatło włączŚwiatło = new PolecenieWłączŚwiatło(światło);
        PolecenieOtwórzDrzwiGarażowe otwórzDrzwiGarażowe = 
                new PolecenieOtwórzDrzwiGarażowe(drzwiGarażowe);
        
        pilot.ustawPolecenie(włączŚwiatło);
        pilot.przyciskZostałNaciśnięty();
        pilot.ustawPolecenie(otwórzDrzwiGarażowe);
        pilot.przyciskZostałNaciśnięty();
    }
}
