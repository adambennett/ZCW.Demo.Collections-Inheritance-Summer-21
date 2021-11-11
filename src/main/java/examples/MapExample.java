package examples;

import java.util.*;

@SuppressWarnings("UnusedAssignment")
public class MapExample
{

    // ARRAY

    // [ Red, Large... ]


    // MAP

    // [
    //  Color: Red,
    //  Size: Large
    // ]

    public static void run()
    {

        // ARRAY LIST /////////////////////////////////////////////////////////////////////////////////////////////////
        var list = new ArrayList<String>();
        list.add("Red");
        list.add("Large");

        // To get the object's color from this list, we must memorize or hardcode list.get(0)
        String color = list.get(0);

        var test = list.contains("Red");

        System.out.println("List contains \"Red\": " + test);


        // HASH MAP ///////////////////////////////////////////////////////////////////////////////////////////////////
        var map = new HashMap<String, String>();
        map.put("Color", "Red");
        map.put("Size", "Large");

        // To get the object's color from the map, we just need to ask for it
        color = map.get("Color");

        System.out.println("Color: " + color);

    }

}
