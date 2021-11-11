package examples;

import java.util.*;

public class InstanceOfExample2
{

    @SuppressWarnings("StatementWithEmptyBody")
    private static class Adder
    {
        public static Object sum(Object input, int add)
        {
            if (input instanceof Number num)
            {
                return num.intValue() + add;
            }
            else if (input instanceof Collection collection)
            {
                if (collection.size() == 0) return add;
                var total = add;
                for (var obj : collection) {
                    if (!(obj instanceof Number num)) {
                        throw new UnsupportedOperationException("Input must be a number, Collection of numbers, or Array of numbers.");
                    }
                    total += num.intValue();
                }
                return total;
            }
            else if (input.getClass().isArray())
            {
                // same thing but with array, ew
            }
            else
            {
                throw new UnsupportedOperationException("Input must be a number, Collection of numbers, or Array of numbers.");
            }
            return null;
        }
    }

    public static void run()
    {
        var listInput = new ArrayList<Number>();
        listInput.add(10);
        listInput.add(20);

        var output = Adder.sum(listInput, 10);

        if (output instanceof Number num) {
            System.out.println("Value: " + num.intValue());
        } else {
            System.out.println("something went wrong");
        }
    }

}
