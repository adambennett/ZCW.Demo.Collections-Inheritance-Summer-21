package examples;

import inheritance.*;

import java.util.*;

public class MapExample2
{

    public static void run()
    {
        var map = new HashMap<String, Product>();

        var apples = new Product("6881-9292", 15, "Apples", 1.25);
        var beef = new Product("6881-9293", 2, "Ground Beef (1 lb)", 7.50);

        map.put(apples.item, apples);
        map.put(beef.item, beef);

        for (var entry : map.entrySet())
        {
            if (entry.getKey().equals("Apples"))
            {
                System.out.println("Number of " + entry.getKey() + " purchased: " + entry.getValue().quantity);
            }
        }

        var testKeyValue = map.getOrDefault("Apples", null);

        System.out.println("Number of " + testKeyValue.item + " purchased: " + testKeyValue.quantity);
    }

}
