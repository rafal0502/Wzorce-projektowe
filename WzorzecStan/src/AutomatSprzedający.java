/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class AutomatSprzedający {
    
   Stan stanBrakGum;
   Stan stanNieMaMonety;
   Stan stanJestMoneta;
   Stan stanGumaSprzedana;
   
   Stan stan = stanBrakGum; // zmienna egzemplarza z informacją o stanie bieżącym
   int liczba = 0;
   
   
   
   public AutomatSprzedający(int liczbaGum)
   {
       stanBrakGum = new StanBrakGum(this);
       stanNieMaMonety = new StanNieMaMonety(this);
       stanJestMoneta = new StanJestMoneta(this);
       stanGumaSprzedana = new StanGumaSprzedana(this);
       
       this.liczba = liczbaGum;
       if(liczbaGum > 0){
           stan = stanNieMaMonety;
       }
       
   }
       public void włóżMonetę()
       {
           stan.włóżMonetę();
       }
       
       
       public void zwróćMonetę()
       {
           stan.zwróćMonetę();
       }
       
       public void przekręćGałkę()
       {
           stan.przekręćGałkę();
           stan.wydaj();
       }
       
       void ustawStan(Stan stan)
       {
           this.stan = stan;
       }
       
      public void zwolnijGumę()
       {
           System.out.println("Wypada guma...");
           if(liczba != 0)
           {
               liczba = liczba - 1;
           }
           
       }
       
       
   
      public  Stan pobierzStanNieMaMonety()
    {
        return this.stanNieMaMonety;
    }

       public  Stan pobierzStanBrakGum()
    {
        return  this.stanBrakGum;
    }
    
       public  Stan pobierzStanJestMoneta()
    {
        return this.stanJestMoneta;
    }

       public  Stan pobierzStanGumaSprzedana()
    {
        return this.stanGumaSprzedana;
    }

   

    int pobierzLiczba() {
       return liczba;
    }

    public void setStan(Stan stan) {
        this.stan = stan;
    }

    public Stan pobierzStan()
    {
        return stan;
    }
    
    
    
}
