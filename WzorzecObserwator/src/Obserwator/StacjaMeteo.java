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
public class StacjaMeteo {
    
    public static void main(String[] args)
    {
        DanePogodowe danePogodowe = new DanePogodowe();
        
        PrognozaWyświetl prognozaWyświetl = new PrognozaWyświetl(danePogodowe);
        
        danePogodowe.ustawOdczyt((float) 26.6,65,1013.f);
        danePogodowe.ustawOdczyt((float) 27.7,70,997.0f);
        danePogodowe.ustawOdczyt((float) 25.5,90, 997.0f);
    }
}
