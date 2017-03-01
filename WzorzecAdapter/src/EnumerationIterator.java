/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;
    
    public EnumerationIterator(Enumeration enumeration)
    {
        this.enumeration = enumeration;
    }
    
    public boolean hasNext()
    {
        return enumeration.hasMoreElements();
    }
    public Object next()
    {
        return enumeration.nextElement();
    }
    
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
