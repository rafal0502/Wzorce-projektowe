/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class PolecenieOtwórzDrzwiGarażowe implements Polecenie{
     DrzwiGarażowe drzwiGarażowe;
    
    public PolecenieOtwórzDrzwiGarażowe(DrzwiGarażowe drzwiGarażowe)
    {
        this.drzwiGarażowe = drzwiGarażowe;
    }
    public void wykonaj()
    {
        drzwiGarażowe.doGóry();
    }
    
    public void wycofaj(){}
}
