/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafal
 */
public class IteratorEnumeration implements Enumeration {
    
    Iterator iterator;
    
    public IteratorEnumeration (Iterator iterator)
    {
        this.iterator = iterator;
    }
    
    public boolean hasMoreElements()
    {
        return iterator.hasNext();
    }
    
    public Object nextElement()
    {
        return iterator.next();
    }
}
