/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class FasadaKinaDomowego {
    Wzmacniacz wzmacniacz;
    Tuner tuner;
    OdtwarzaczDVD dvd;
    OdtwarzaczCD cd;
    Projektor projektor;
    OświetlenieKinowe oświetlenie;
    Ekran ekran;
    MaszynkaPopcorn popcorn;
    
    
    public FasadaKinadomowego(
    Wzmacniacz wzmacniacz,
    Tuner tuner,
    OdtwarzaczDVD dvd,
    OdtwarzaczCD cd,
    Projektor projektor,
    OświetlenieKinowe oświetlenie,
    Ekran ekran,
    MaszynkaPopcorn popcorn)
    {
        this.wzmacniacz = wzmacniacz;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projektor = projektor;
        this.ekran = ekran;
        this.oświetlenie = oświetlenie;
        this.popcorn = popcorn;
    }
    
    
    public void odtwarzanieFilmu(String film)
    {
        System.out.println("---- Przygotuj się na seans filmowy...");
        popcorn.włącz();
        popcorn.przygotujPopcorn();
        oświetlenie.ściemniaj();
        ekran.wDół();
        projektor.włącz();
        projektor.trybSzerokoekranowy();
        wzmacniacz.włącz();
        wzmacniacz.ustawDVD(dvd);
        wzmacniacz.ustawDźwiękPrzestrzenny ();
        dvd.włącz();
        dvd.odtwarzaj(film);
    }
    
    
    public void koniecFilmu()
    {
        System.out.println("\n---- Koniec seansu, wyłączam kino domowe...");
        popcorn.wyłącz();
        oświetlenie.włącz();
        ekran.wGórę();
        projektor.wyłącz();
        wzmacniacz.wyłącz();
        dvd.zatrzymaj();
        dvd.wysuńDysk();
        dvd.wyłącz();
    }
    
    
    
    
}
