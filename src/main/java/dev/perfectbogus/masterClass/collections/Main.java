package dev.perfectbogus.masterClass.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.getSeats());

        seatCopy.get(1).reserve();
        printList(theatre.getSeats());
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat: list){
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("========================");
    }
}
