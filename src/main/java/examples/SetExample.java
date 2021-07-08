package examples;

import java.util.*;

public class SetExample
{

    private static class SetObject
    {
        public String name;

        public SetObject(String name)
        {
            this.name = name;
        }

        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SetObject setObject = (SetObject) o;
            return Objects.equals(name, setObject.name);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(name);
        }
    }

    public static void run()
    {
        var objects = new HashSet<SetObject>();

        SetObject obj1 = new SetObject("Test");
        SetObject obj2 = new SetObject("Test");
        SetObject obj3 = new SetObject("Adam");

        objects.add(obj1);
        objects.add(obj2);
        objects.add(obj3);

        System.out.println("Size of set: " + objects.size());
    }

}
