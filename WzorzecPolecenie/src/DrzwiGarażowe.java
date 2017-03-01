/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class DrzwiGarażowe {
    private String nazwa;
    
    public DrzwiGarażowe() {  
    }
    
    public DrzwiGarażowe (String nazwa)
    {
       this.nazwa = nazwa;
    }

    
    public void doGóry(){
        System.out.println("Otwieram drzwi");
    }
       public void naDół(){
        System.out.println("Zamykam drzwi");
    }
        public void włączŚwiatło(){
        System.out.println("Włączam światło w garażu");
    }
        public void wyłączŚwiatło(){
        System.out.println("Wyłączam światło w garażu");
    }
        
}
