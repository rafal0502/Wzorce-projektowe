/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class AutomatSprzedającyTest {
    
    public static void main(String[] args)
    {
        AutomatSprzedający automatSprzedający = new AutomatSprzedający(5);
        
        System.out.println(automatSprzedający);
        
        automatSprzedający.włóżMonetę();
        automatSprzedający.przekręćGałkę();
        
        System.out.println(automatSprzedający);
        
        automatSprzedający.włóżMonetę();
        automatSprzedający.przekręćGałkę();
        automatSprzedający.włóżMonetę();
        automatSprzedający.przekręćGałkę();
        
        System.out.println(automatSprzedający);
    }
}
