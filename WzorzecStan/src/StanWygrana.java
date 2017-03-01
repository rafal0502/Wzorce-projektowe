/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class StanWygrana implements Stan {
  
    AutomatSprzedający automatSprzedający;
    
    public StanWygrana (AutomatSprzedający automatSprzedający)
    {
        this.automatSprzedający = automatSprzedający;
    }

   
    
    public void włóżMonetę()
    {
        System.out.println("Nie musisz wkładać monety. Wygrałeś! ");
    }
    
    public void zwróćMonetę()
    {
        System.out.println("Nie można zwrócić Ci monety bo jej nie wrzuciłeś");
    }
    
    public void przekręćGałkę()
    {
        System.out.println("Nie przekręcaj gałki. Nie ma sansu.");
    }
    
    
    public void wydaj()
    {
        System.out.println("WYGRAŁEŚ! Dostsjesz drugą gumę");
        automatSprzedający.zwolnijGumę();
        if ( automatSprzedający.pobierzLiczba() == 0)
        {
            automatSprzedający.ustawStan(automatSprzedający.pobierzStanBrakGum());
        } else {
            automatSprzedający.zwolnijGumę();
            if(automatSprzedający.pobierzLiczba() >  0)
                    {
                        automatSprzedający.ustawStan(automatSprzedający.pobierzStanNieMaMonety());
                    } else {
                System.out.println("Ups, koniec gum! ");
                automatSprzedający.ustawStan(automatSprzedający.pobierzStanBrakGum());
            }
        }
    }
    
}
