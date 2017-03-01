/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class StanBrakGum implements Stan {
    
    AutomatSprzedający automatSprzedający;

   
    public StanBrakGum(AutomatSprzedający automatSprzedający)
    {
        this.automatSprzedający = automatSprzedający;
    }
    
    public void włóżMonetę()
    {
        System.out.println("Nie ma gum, nic nie kupisz");
    }
    
    public void zwróćMonetę()
    {
        System.out.println("Zwracam monetę bo nie ma gum");
    }
    
    public void przekręćGałkę()
    {
        System.out.println("Machaj ile chcesz, brak gum");
    }
    
    public void wydaj()
    {
        System.out.println("Nie ma gum w automacie do wydania! ");
    }
}
