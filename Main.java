package com.company;

public class Main {
    public static void main(String[] args) {
        Park park1 = new Park();
        Park park2 = new Park();
        park2.printEntranceTicketPrize();
        Park park3 = new Park();
        System.out.println(park1.toString());
        System.out.println(park2.toString());
        System.out.println(park3.toString());
    }
}
