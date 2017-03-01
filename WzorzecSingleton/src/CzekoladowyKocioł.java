/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class CzekoladowyKocioł {
    private boolean pusty;
    private boolean ugotowany;
    private volatile static CzekoladowyKocioł unikalnaInstancja;
    
    private CzekoladowyKocioł()
{
    pusty = true;
    ugotowany  = false;
}
    
    public static synchronized CzekoladowyKocioł pobierzInstancję()
    {
        if (unikalnaInstancja == null) {
            synchronized(Singleton.class) {
        if (unikalnaInstancja == null) {
            unikalnaInstancja = new CzekoladowyKocioł();
        }
            }
        }
             return unikalnaInstancja;
    }
    
    
   
    public void napełniaj()
    {
        if (jestPusty()){
            pusty = false;
            ugotowany = false;
            //napełniaj bojler mieszanką mleka i czekolady
        }
    }
    
    public void opróżniaj()
    {
     if(!jestPusty() && jestUgotowany())   {
         //opróżniaj bojler z ugotowanej mieszanki mleka i czekolady
         pusty = true;
     }
    }
    
    public void gotuj() {
        if(!jestPusty() && !jestUgotowany()) {
            // gotuj zawartość kotła
            ugotowany = true;
        }
    }
    
    public boolean jestPusty() {
        return pusty;
    }
    
    public boolean jestUgotowany(){
        return ugotowany;
    }
    
    public void wypuść ()
    {
        System.out.println("Wypuszczam ją");
    }
           
    }
     
     
     
     
    
    
    
    
    
    
    
    
    

