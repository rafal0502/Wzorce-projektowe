/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class GęśAdapter implements Kwacząca {
    Gęś gęś;
    
    public GęśAdapter(Gęś gęś)
    {
        this.gęś = gęś;
    }
    
    public void kwacz()
    {
        gęś.gęgaj();
    }
}
