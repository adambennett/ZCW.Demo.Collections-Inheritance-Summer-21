package examples;

import collections.*;
import inheritance.*;
import util.*;

import java.util.*;

@SuppressWarnings("ALL")
public class InstanceOfExample
{

    public static void run()
    {
        var truck = new Truck(0, 0);

        var car = new Car(0, 0);

        var depot = new Depot();

        System.out.println("Truck is sellable: " + (truck instanceof Sellable));
        System.out.println("Truck is a vehicle: " + (truck instanceof Vehicle));
        System.out.println("Truck is a comparator: " + (truck instanceof Comparator));
        System.out.println("Car is sellable: " + (car instanceof Sellable));
        System.out.println("Car is a vehicle: " + (car instanceof Vehicle));
        System.out.println("Car is an iterator: " + (car instanceof Iterator));
        System.out.println("Depot is an iterator: " + (depot instanceof Iterator));
        System.out.println("Depot is a list: " + (depot instanceof List));


        System.out.println("Depot is an itearable: " + (depot instanceof Iterable));

        CommonUtilities.printInstanceOfExample(depot instanceof Iterable, "Depot", "itearable");

        CommonUtilities.printInstanceOfExample(Depot.class, Iterable.class);
    }

}
