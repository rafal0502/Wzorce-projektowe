/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obserwator;

/**
 *
 * @author rafal
 */
public interface Podmiot {
    public void zarejestrujObserwatora(Obserwator o);
    public void usuńObserwatora(Obserwator o);
    public void powiadomObserwatora();
}
