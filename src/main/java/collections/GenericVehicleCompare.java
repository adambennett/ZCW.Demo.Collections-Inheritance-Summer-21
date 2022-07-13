package collections;

import inheritance.*;

import java.util.*;

public record GenericVehicleCompare(SortingFunction<Vehicle> function) implements Comparator<Vehicle>
{

    @Override
    public int compare(Vehicle o1, Vehicle o2)
    {
        return Integer.compare(function.comparison(o1), function.comparison(o2));
    }

}
