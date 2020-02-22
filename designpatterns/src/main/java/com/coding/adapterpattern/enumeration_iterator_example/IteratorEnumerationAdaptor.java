package com.coding.adapterpattern.enumeration_iterator_example;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Clients can use Enumeration
 * so this adaptor is from iterator -> enumeration
 */
public class IteratorEnumerationAdaptor implements Enumeration {
    Iterator iterator; //this adaptor is using COMPOSITION

    public IteratorEnumerationAdaptor(Iterator iterator) {
      this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
