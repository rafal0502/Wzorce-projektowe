/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class MiniPilot {
    Polecenie slot;
    
    public void ustawPolecenie(Polecenie polecenie) {
        slot = polecenie;
    }
    
    public void przyciskZostałNaciśnięty() {
        slot.wykonaj();
    }
}
