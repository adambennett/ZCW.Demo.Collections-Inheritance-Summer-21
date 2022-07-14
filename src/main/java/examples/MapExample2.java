package examples;

import inheritance.*;

import java.util.*;

public class MapExample2
{

    public static void run()
    {
        Map<String, Product> map = new HashMap<String, Product>();

        Product apples = new Product("6881-9292", 15, "Apples", 1.25);
        Product beef = new Product("6881-9293", 2, "Ground Beef (1 lb)", 7.50);

        map.put(apples.item, apples);
        map.put(beef.item, beef);

        for (Map.Entry<String, Product> entry : map.entrySet())
        {
            if (entry.getKey().equals("Apples"))
            {
                System.out.println("Number of " + entry.getKey() + " purchased: " + entry.getValue().quantity);
            }
        }

        Product testKeyValue = map.getOrDefault("Apples", null);

        System.out.println("Number of " + testKeyValue.item + " purchased: " + testKeyValue.quantity);

        boolean isApplesInMap = map.containsKey("Apples");
        System.out.println("Apples appeared in the map: " + isApplesInMap);

        for (Product entry : map.values()) {
            System.out.println("Values: " + entry.item);
        }

        for (String entry : map.keySet()) {
            System.out.println("Keys: " + entry);
        }
    }

}
