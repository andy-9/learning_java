package org.example;

public class Car {
    public static void main(String[] args) {
        Door dd = new Door();
        dd.name = "Driver";
        dd.open();
        dd.printStatus();

        Door pd = new Door();
        pd.name = "Passenger";
        pd.printStatus();
    }
}
