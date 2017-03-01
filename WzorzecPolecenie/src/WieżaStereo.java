/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class WieżaStereo {
    
     private String nazwa;
    
    public WieżaStereo() {  
    }
    
    public WieżaStereo(String nazwa)
    {
       this.nazwa = nazwa;
    }


    
       public void włącz(){
        System.out.println("Włączam wieżę w " + nazwa);
    }
       public void wyłącz(){
        System.out.println("Wyłączam wieżę w " + nazwa);
    }
        public void ustawCD(){
        System.out.println("Odpalam CD w " + nazwa);
    }
        public void ustawDVD(){
        System.out.println("Odpalam DVD w " + nazwa );
    }
        public void ustawRadio(){
        System.out.println("Odpalam radio w " + nazwa);
    }
        public void ustawGłośność(int głośność){
        System.out.println("Ustawiam głośność na: " + głośność + " w " + nazwa);
    }
    
}
