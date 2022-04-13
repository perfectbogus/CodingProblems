package dev.perfectbogus.simpleHashSet;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleHashSet implements SimpleSet {

    private Entry[] buckets;
    private int size;

    public SimpleHashSet(int capacity) {
        this.buckets = new Entry[capacity];
        this.size = 0;
    }

    private int hashFunction(int hashCode){
        int index = hashCode;
        if(index < 0)
            index = -index;
        return index % buckets.length;
    }

    private static class Entry {
        Object key;
        Entry next;
    }

    public class SimpleHashSetIterator implements Iterator {

        private int currentBucket;
        private int previousBucket;
        private Entry currentEntry;
        private Entry previousEntry;

        public SimpleHashSetIterator() {
            currentEntry = null;
            previousEntry = null;
            currentBucket = -1;
            previousBucket = -1;
        }

        @Override
        public boolean hasNext() {
            if(currentEntry != null && currentEntry.next != null){
                return true;
            }
            for (int index = currentBucket + 1; index < buckets.length; index++) {
                if (buckets[index] != null) {
                    return true;
                }
            }
            // nothing left
            return false;
        }

        @Override
        public Object next() {
            previousEntry = currentEntry;
            previousBucket = currentBucket;
            //if either the current or next node are null
            if (currentEntry == null || currentEntry.next == null) {
                // go to the next bucket
                currentBucket++;
                // keep going until you find a bucket with a node
                while (currentBucket < buckets.length && buckets[currentBucket] == null) {
                    currentBucket++;
                }
                if (currentBucket < buckets.length) {
                    currentEntry = buckets[currentBucket];
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                currentEntry = currentEntry.next;
            }
            return currentEntry.key;
        }
    }

    @Override
    public boolean add(Object element) {
        int index = hashFunction(element.hashCode());
        Entry current = buckets[index];
        while(current != null){
            // element is already in set
            if (current.key.equals(element)) {
                return false;
            }
            // otherwise visit next entry in the bucket
            current = current.next;
        }
        // no element found so add new entry
        Entry  entry = new Entry();
        entry.key = element;
        entry.next = buckets[index];
        buckets[index] = entry;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object element) {
        int index = hashFunction(element.hashCode());
        Entry current = buckets[index];
        Entry previous = null;
        while(current != null){
            // element found so remove it
            if (current.key.equals(element)) {
                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        // no element found nothing to remove
        return false;
    }

    @Override
    public boolean contains(Object element) {
        int index = hashFunction(element.hashCode());
        Entry current = buckets[index];

        while (current != null){
            //check if node contains element
            if(current.key.equals(element)){
                return true;
            }
            current = current.next;
        }
        // no elements where found
        return false;
    }

    @Override
    public Iterator iterator() {
        return new SimpleHashSetIterator();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString(){
        Entry currentEntry = null;
        StringBuffer sb = new StringBuffer();

        for (int index = 0; index < buckets.length; index++) {
            if (buckets[index] != null) {
                currentEntry = buckets[index];
                sb.append("["+ index +"]");
                sb.append(" " + currentEntry.key.toString());
                while (currentEntry.next != null) {
                    currentEntry = currentEntry.next;
                    sb.append(" -> " + currentEntry.key.toString());
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
