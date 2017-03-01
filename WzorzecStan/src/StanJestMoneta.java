
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class StanJestMoneta  implements Stan {
    Random losowaWygrana = new Random (System.currentTimeMillis());
    AutomatSprzedający automatSprzedający;
    
    public  StanJestMoneta (AutomatSprzedający automatSprzedający)
    {
        this.automatSprzedający = automatSprzedający;
    }
    
    public void włóżMonetę()
    {
        System.out.println("Nie możesz włożyć więcej niż jednej monety");
    }
    
    public void zwróćMonetę()
    {
        System.out.println("Moneta zwrócona");
        automatSprzedający.ustawStan(automatSprzedający.pobierzStanNieMaMonety());
    }
    
    public void przekręćGałkę()
    {
        System.out.println("Obróciłeś gałkę...");
        int wygrana = losowaWygrana.nextInt(10);
        if (wygrana == 0){
        automatSprzedający.ustawStan(automatSprzedający.pobierzStanGumaSprzedana());    
        } else {
            automatSprzedający.ustawStan(automatSprzedający.pobierzStanGumaSprzedana());
        }
        
    }
    
    public void wydaj()
    {
        System.out.println("Nie wydano gumy");
    }

   
}
