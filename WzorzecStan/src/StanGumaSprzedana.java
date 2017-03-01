/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class StanGumaSprzedana implements Stan {
    
    AutomatSprzedający automatSprzedający;
    
    public StanGumaSprzedana(AutomatSprzedający automatSprzedający)
    {
        this.automatSprzedający = automatSprzedający;
    }

   
    
    public void włóżMonetę()
    {
        System.out.println("Proszę czekać na gumę");
    }
    
    public void zwróćMonetę()
    {
        System.out.println("Niestety, nie można zwrócić monety po przekręceniu gałki");
    }
    
    public void przekręćGałkę()
    {
        System.out.println("Nie dostaniesz gumy tylko dlatego, że przekręciłeś drugi raz! ");
    }
    
    public void wydaj()
    {
        automatSprzedający.zwolnijGumę();
        if(automatSprzedający.pobierzLiczba() > 0)
        {
            automatSprzedający.ustawStan(automatSprzedający.pobierzStanNieMaMonety());
        } else {
            System.out.println("Ups, koniec gum!");
            automatSprzedający.ustawStan(automatSprzedający.pobierzStanBrakGum());
        }
    }
    
    
}
