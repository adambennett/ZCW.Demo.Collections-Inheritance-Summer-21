package examples;

import java.util.*;

public class MapExample2
{

    private static class KeyObject
    {
        public String name;
        public Integer number;
        public Boolean flag;

        public KeyObject(String name, int number, boolean flag)
        {
            this.name = name;
            this.number = number;
            this.flag = flag;
        }
    }

    private static class ValueObject
    {
        public String id;
        public Integer value;
        public String displayName;
        public Boolean isValid;

        public ValueObject(String id, int value, String displayName, boolean isValid)
        {
            this.id = id;
            this.value = value;
            this.displayName = displayName;
            this.isValid = isValid;
        }
    }

    public static void run()
    {
        Map<KeyObject, ValueObject> map = new HashMap<>();

        var key1 = new KeyObject("TestKey", 0, true);
        var key2 = new KeyObject("TestKey", 1, true);

        var value1 = new ValueObject("val1", 1, "Value For Key #1", false);
        var value2 = new ValueObject("val2", 2, "Value For Key #2", true);

        map.put(key1, value1);
        map.put(key2, value2);

        for (var entry : map.entrySet())
        {
            if (entry.getKey().name.equals("TestKey"))
            {
                System.out.println("Value for " + entry.getKey().name + ": " + entry.getValue().value);
            }
        }

        var testKeyValue = map.getOrDefault(key1, null);

        System.out.println("Value for " + key1.name + ": " + testKeyValue.value);
    }

}
