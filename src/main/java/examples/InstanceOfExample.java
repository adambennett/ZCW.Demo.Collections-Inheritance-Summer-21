package examples;

import collections.*;
import inheritance.*;

import java.util.*;

@SuppressWarnings("ALL")
public class InstanceOfExample {

    public static void run()
    {
        Truck truck = new Truck(0, 0);

        Car car = new Car(0, 0);

        Depot depot = new Depot();

        System.out.println("Truck is a vehicle: " + (truck instanceof Vehicle));
        System.out.println("Truck is an automobile: " + (truck instanceof Automobile));
        System.out.println("Truck is a comparator: " + (truck instanceof Comparator));

        System.out.println("Car is a vehicle: " + (car instanceof Vehicle));
        System.out.println("Car is an automobile: " + (car instanceof Automobile));
        System.out.println("Car is an iterator: " + (car instanceof Iterator));

        System.out.println("Depot is an iterator: " + (depot instanceof Iterator));
        System.out.println("Depot is a list: " + (depot instanceof List));
        System.out.println("Depot is an itearable: " + (depot instanceof Iterable));
    }
}
