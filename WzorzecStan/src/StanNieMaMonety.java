/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class StanNieMaMonety implements Stan{
    
    AutomatSprzedający automatSprzedający;
    
    public StanNieMaMonety(AutomatSprzedający automatSprzedający)
    {
        this.automatSprzedający = automatSprzedający;
    }

   
    
    public void włóżMonetę()
    {
        System.out.println("Moneta przyjęta");
        automatSprzedający.setStan(automatSprzedający.pobierzStanJestMoneta());
    }
    
    public void zwróćMonetę()
    {
        System.out.println("Nie włożyłeś monety");
    }
    
    public void przekręćGałkę()
    {
        System.out.println("Zanim przekręcisz gałkę, wrzuć monetę");
    }
    
    public void wydaj()
    {
        System.out.println("Najpierw zapłać");
    }
    
    
}
