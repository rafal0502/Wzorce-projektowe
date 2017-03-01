/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class WentylatorSufitowy {
    public static final int SZYBKO = 3;
    public static final int ŚREDNIO = 2;
    public static final int WOLNO = 1;
    public static final int WYŁĄCZ = 0;
    private String nazwa;
    int prędkość;
    
    
    
    public WentylatorSufitowy(String nazwa)
    {
       this.nazwa = nazwa;
       prędkość = WYŁĄCZ;
    }

    public WentylatorSufitowy() {
       
    }
    
    
    public void wysokieObroty(){
        prędkość = SZYBKO;
        System.out.println("Działam na wysokich obrotach w " + nazwa);
    }
    
    public void średnieObroty()
    {
        prędkość = ŚREDNIO;
        System.out.println("Działam na średnich obrotach w " + nazwa);
    }
    
      
    public void niskieObroty()
    {
        prędkość = WOLNO;
        System.out.println("Działam na niskich obrotach w " + nazwa);
    }
    
    public void wyłącz()
    {
        prędkość = WYŁĄCZ;
        System.out.println("Wyłączam wentylator w "  + nazwa);
    }
    
    public int pobierzPrędkość()
    {
        System.out.println("Pobieram prędkość : "  + prędkość);
        return prędkość;
    }
}
