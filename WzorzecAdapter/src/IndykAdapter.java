/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class IndykAdapter implements Kaczka {
    Indyk indyk;
    
    public IndykAdapter(Indyk indyk)
    {
        this.indyk = indyk;
    }
    
    public void kwacz()
    {
        indyk.gulgocz();
    }
    
    public void lataj()
    {
        for(int i = 0; i < 5 ; i++)
        {
            indyk.lataj();
        }
    }
}
