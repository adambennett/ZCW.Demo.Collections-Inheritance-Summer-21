package examples;

import java.util.*;
import java.util.concurrent.*;

public class FailExamples
{

    public static void run()
    {
        var threadSafeList = new CopyOnWriteArrayList<String>(); // Fail-safe
        var unsafeList = new ArrayList<String>();                // Fail-fast

        threadSafeList.add("Test");
        threadSafeList.add("Test");
        threadSafeList.add("Test");
        threadSafeList.add("Test");
        threadSafeList.add("Test");

        unsafeList.add("Test");
        unsafeList.add("Test");
        unsafeList.add("Test");
        unsafeList.add("Test");
        unsafeList.add("Test");

        for (var str : threadSafeList)
        {
            if (str.equals("Test"))
            {
                System.out.println("Operating on thread safe list");
                threadSafeList.remove(str);
                threadSafeList.add("Adam");
            }
        }

        System.out.println("Thread safe list" + threadSafeList);

        for (var str : unsafeList)
        {
            if (str.equals("Test"))
            {
                System.out.println("Operating on unsafe list");
                unsafeList.remove(str);
                unsafeList.add("Adam");
            }
        }

        System.out.println("Unsafe list" + unsafeList);
    }

}
