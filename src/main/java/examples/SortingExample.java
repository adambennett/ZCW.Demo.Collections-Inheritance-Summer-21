package examples;

import collections.*;
import inheritance.*;

import java.util.*;

public class SortingExample
{

    public static void run()
    {
        var depot = new Depot();

        var smallTruck = new Truck(6, 2);
        smallTruck.name = "Small Truck";
        smallTruck.speedUp(10);

        var bigTruck = new Truck(1600, 20);
        bigTruck.name = "Big Truck";
        bigTruck.speedUp(5);

        var smallCar = new Car(4, 4);
        smallCar.name = "Small Car";
        smallCar.speedUp(50);

        var bigCar = new Car(4, 6);
        bigCar.name = "Big Car";
        bigCar.speedUp(11);

        depot.park(smallTruck);
        depot.park(bigTruck);
        depot.park(smallCar);
        depot.park(bigCar);


        // Standard sort using Comparable, which will use Vehicle.compareTo()
        depot.sort();
        Collections.sort(depot.getDocked());

        System.out.println("\nSorted by speed: " + depot + "\n");

        for (var vehicle : depot)
        {
            System.out.println("Vehicle in depot: " + vehicle.name);
        }


        // More specific sort using pre-defined custom Comparator
        depot.getDocked().sort(new MaxSpeedCompare());

        // Or just make your own Comparator on the fly with an anonymous class
        depot.getDocked().sort(new Comparator<>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return Integer.compare(o1.getWheels(), o2.getWheels());
            }
        });

        // Or just make your own Comparator on the fly with a lambda function
        depot.getDocked().sort((o1, o2) -> Integer.compare(o1.getMaxSpeed(), o2.getMaxSpeed()));

        // Dynamic sort based on whatever method you want to use
        depot.sort(Vehicle::getSeats);

    }

}
