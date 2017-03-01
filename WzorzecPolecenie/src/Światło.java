/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class Światło {
    private String nazwa;
    
    public Światło() {  
    }
    
    public Światło(String nazwa)
    {
       this.nazwa = nazwa;
    }

    
    
    
    public void włącz(){
        System.out.println("Światło zostało włączone w " + nazwa);
             
    }
    
    public void wyłącz(){
        System.out.println("Światło zostało wyłączone w " + nazwa);
             
    }
    
}
