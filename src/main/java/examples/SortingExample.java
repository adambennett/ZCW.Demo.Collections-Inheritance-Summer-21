package examples;

import inheritance.*;

import java.util.*;

public class SortingExample
{

    public static void run()
    {
        Car smallCar = new Car(4, 4);
        smallCar.name = "Small Car";
        smallCar.speedUp(50);

        Car bigCar = new Car(4, 6);
        bigCar.name = "Big Car";
        bigCar.speedUp(11);

        List<Vehicle> list = new ArrayList<Vehicle>();
        list.add(smallCar);
        list.add(bigCar);

        // Standard sort using Comparable, which will use Vehicle.compareTo()
        Collections.sort(list);

        System.out.println("\nSorted by speed: " + list + "\n");

        for (Vehicle vehicle : list)
        {
            System.out.println("Vehicle in depot: " + vehicle.name);
        }

    }

}
