/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public abstract class NapójZKofeiną {
    
    final void recepturaParzenia()
    {
        gotowanieWody();
        zaparzanie();
        nalewanieDoFiliżanki();
        domieszanieDodatków();
    }

    abstract void zaparzanie();
    
    abstract void domieszanieDodatków();
    
    void gotowanieWody()
    {
        System.out.println("Gotowanie wody");
    }
    
    void nalewanieDoFiliżanki()
    {
        System.out.println("Nalewanie do filiżanki");
    }
    
}
