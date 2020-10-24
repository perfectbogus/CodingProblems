package dev.perfectbogus.linkedLists;

import dev.perfectbogus.linkedLists.Partition.BookLinkedListNode;

public class SumList {

    public static void main(String[] args){
        BookLinkedListNode aHeadList = new BookLinkedListNode(7);

        BookLinkedListNode aListB = new BookLinkedListNode(1);
        aHeadList.next = aListB;

        BookLinkedListNode aListC = new BookLinkedListNode(6);
        aListB.next = aListC;

        BookLinkedListNode bHeadList = new BookLinkedListNode(5);

        BookLinkedListNode bListB = new BookLinkedListNode(9);
        bHeadList.next = bListB;

        BookLinkedListNode bListC = new BookLinkedListNode(5);
        bListB.next = bListC;

        System.out.println(getSize(aHeadList));
        System.out.println(getSum(aHeadList));


    }

    public static double sumLists(BookLinkedListNode aList, BookLinkedListNode bList){
        //get size of each lists
        int aListSize = getSize(aList);
        int bListSize = getSize(bList);
        double aSumList = getSum(aList);
        double bSumList = getSum(bList);
        //

        return 0;
    }

    public static double getSum(BookLinkedListNode list){
        int i = 0;
        double sum = 0;
        while(list != null){
            sum += list.data * Math.pow(10, i++);
            list = list.next;
        }
        return sum;
    }

    public static int getSize(BookLinkedListNode list){
        int i = 0;
        while(list != null){
            i++;
            list = list.next;
        }
        return i;
    }


}
