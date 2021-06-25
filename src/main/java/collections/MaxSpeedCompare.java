package collections;

import inheritance.*;

import java.util.*;

public class MaxSpeedCompare implements Comparator<Automobile>
{
    @Override
    public int compare(Automobile o1, Automobile o2)
    {
        return Integer.compare(o1.getMaxSpeed(), o2.getMaxSpeed());
    }
}
