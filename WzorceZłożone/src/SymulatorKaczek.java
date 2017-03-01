/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class SymulatorKaczek {
    public static void main(String[] args)
    {
        SymulatorKaczek symulator = new SymulatorKaczek();
        symulator.uruchom();
    }
    
    void uruchom()
    {
        Kwacząca dzikaKaczka =  new KwakLicznik (new DzikaKaczka());
        Kwacząca płaskonosaKaczka =  new KwakLicznik (new PłaskonosaKaczka());
        Kwacząca wabikKaczka =  new KwakLicznik (new WabikKaczka());
        Kwacząca gumowaKaczka =  new KwakLicznik (new GumowaKaczka());
        Kwacząca gęśKaczka =  new GęśAdapter (new Gęś());
        
        System.out.println("\nSymulator Kaczek");
        
        uruchom(dzikaKaczka);
        uruchom(płaskonosaKaczka);
        uruchom(wabikKaczka);
        uruchom(gumowaKaczka);
        uruchom(gęśKaczka);
        
        System.out.println("Kaczki kwaknęły " + KwakLicznik.pobierzLiczbaKwaknięć() + "razy");
    }  
    
    void uruchom(Kwacząca kaczka)
    {
        kaczka.kwacz();
    }
}
