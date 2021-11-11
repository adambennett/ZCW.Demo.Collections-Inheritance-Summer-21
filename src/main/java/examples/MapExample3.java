package examples;

import collections.*;
import inheritance.*;

import java.util.*;

public class MapExample3
{
    public static void run()
    {
        var map = new HashMap<String, Product>();
        var warehouse = new Warehouse();

        // Organize warehouse
        for (var product : warehouse)
        {
            if (map.containsKey(product.product))
            {
                var mapped = map.get(product.product);
                mapped.quantity++;
            }

            else
            {
                map.put(product.product, product);
            }
        }

        // Print contents of warehouse
        for (var entry : map.entrySet())
        {
            System.out.println("{\n    " + entry.getKey() + ": " + entry.getValue() + "\n},");
        }
    }

}
