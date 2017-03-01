/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class KwakLicznik implements Kwacząca { //KwakLicznik to implementacja wzorca Dekorator
    Kwacząca kaczka;
    static int liczbaKwaknięć;
    
    
    public KwakLicznik (Kwacząca kaczka)
    {
        this.kaczka = kaczka;
    }
    
    public void kwacz()
    {
        kaczka.kwacz();
        liczbaKwaknięć++;
    }
    
    public static int pobierzLiczbaKwaknięć()
    {
        return liczbaKwaknięć;
    }
    
}
