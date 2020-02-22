package com.coding.adapterpattern.enumeration_iterator_example;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Enumeration is the old Interface
 * Iterator is the new Interface
 *
 * As a developer, we are using Iterator.
 * Now, what if there is some old code using Enumeration interface, but we allowed to use only Iterators.
 * This means we have to write an Adaptor for Enumeration interface.
 *
 * methods in Enumeration: nextElement(), hasMoreElements()
 * methods in Iterator: next(), hasNext(), remove()
 *
 * So my adaptor will have all the methods that clients can use. i.e. next(), hasNext(), remove()
 */
//Since, we are adapting Enumeration to Iterator, our adaptor implements Iterator(it has to look like an Iterator)
public class EnumerationIteratorAdaptor implements Iterator {
    Enumeration enumeration; // our adaptor is COMPOSED of Enumeration

    public EnumerationIteratorAdaptor(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
