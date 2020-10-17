package dev.perfectbogus.linkedLists;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveDuplicates {

    public static void main(String[] args){

    }

    /**
     * Remove Duplicates:
     *  Write Code to remove duplicates from an unsorted linked list.
     *
     * Follow up:
     *  How would you solve this problem if a temporary buffer is not allowed.
     */
    public static void removeDuplicates(LinkedList<String> n){
        HashSet<Integer> set = new HashSet<>();
        LinkedList<String> previous = null;
        ListIterator<String> listIterator = n.listIterator();
        while( listIterator.hasNext() ){
            String nextStr = listIterator.next();
            if(set.contains(nextStr)){

            }
        }
    }

}
