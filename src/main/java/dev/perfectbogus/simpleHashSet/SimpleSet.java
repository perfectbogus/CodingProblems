package dev.perfectbogus.simpleHashSet;

import java.util.Iterator;

public interface SimpleSet {
    boolean add(Object element);
    boolean remove(Object element);
    boolean contains(Object element);
    Iterator iterator();
    int size();
}
