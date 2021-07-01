package examples;

import collections.*;
import inheritance.*;

public class SortingExample {

    public static void run()
    {
        Depot depot = new Depot();

        Truck smallTruck = new Truck(6, 2);
        smallTruck.name = "Small Truck";
        smallTruck.speedUp(10);

        Truck bigTruck = new Truck(1600, 20);
        bigTruck.name = "Big Truck";
        bigTruck.speedUp(5);

        Car smallCar = new Car(4, 4);
        smallCar.name = "Small Car";
        smallCar.speedUp(50);

        Car bigCar = new Car(4, 6);
        bigCar.name = "Big Car";
        bigCar.speedUp(11);

        depot.park(smallTruck);
        depot.park(bigTruck);
        depot.park(smallCar);
        depot.park(bigCar);


        // Standard sort using Comparable, or Automobile.compareTo()
        depot.sort();

        System.out.println("\nSorted by speed: " + depot + "\n");

        for (var automobile : depot)
        {
            System.out.println("Automobile in depot: " + automobile.name);
        }


        // More specific sort using custom Comparator
        depot.getDocked().sort(new MaxSpeedCompare());

        System.out.println("\nSorted by Maximum Speed: " + depot);


        // Dynamic sort based on whatever method you want to use
        depot.sort(Automobile::getSeats);

        System.out.println("\nSorted by # of seats: " + depot + "\n");

        for (var automobile : depot)
        {
            System.out.println("Automobile in depot: " + automobile.name);
        }
    }
}
