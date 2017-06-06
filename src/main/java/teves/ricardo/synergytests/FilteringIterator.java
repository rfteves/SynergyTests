/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teves.ricardo.synergytests;

import java.util.Iterator;

/**
 *
 * @author rfteves
 */
public class FilteringIterator implements Iterator {
    
    private Iterator iterator;
    private IObjectTest myTest;
    FilteringIterator(Iterator iterator, IObjectTest myTest) {
        this.iterator = iterator;
        this.myTest = myTest;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }
    
}
