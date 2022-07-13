package collections;

import inheritance.*;

import java.util.*;

public class MaxSpeedCompare implements Comparator<Vehicle>
{

    @Override
    public int compare(Vehicle o1, Vehicle o2)
    {
        return Integer.compare(o1.getMaxSpeed(), o2.getMaxSpeed());
    }

}
