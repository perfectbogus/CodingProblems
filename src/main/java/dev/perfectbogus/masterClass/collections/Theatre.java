package dev.perfectbogus.masterClass.collections;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {

    private final String name;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.name = name;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public List<Seat> getSeats() {
        return this.seats;
    }

    public String getName(){
        return name;
    }

    private boolean reserveSeat(String seatNumber) {
        int low = 0;
        int high = seats.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        return false;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber){
            this.seatNumber = seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
             this.reserved = false;
             return true;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(@NotNull Theatre.Seat o) {
            return this.seatNumber.compareToIgnoreCase(o.getSeatNumber());
        }
    }
}
