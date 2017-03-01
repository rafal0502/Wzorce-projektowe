/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class NapojeJazdaPróbna {
    public static void main(String[] args)
    {
        
        Herbata herbata = new Herbata();
        Kawa kawa = new Kawa();
        
        System.out.println("\n Przyrządzam wspaniałą, gorącą herbatę...");
        herbata.recepturaParzenia();
        
        System.out.println("\n A teraz pora na gorącą, aromatyczną kawę...");
        kawa.recepturaParzenia();
    }
}
