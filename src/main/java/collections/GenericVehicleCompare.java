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

// The 'record' keyword creates a class that looks something like the definition below

/*


public final class GenericVehicleCompare implements Comparator<Vehicle> {

    private final SortingFunction<Vehicle> function;

    public GenericVehicleCompare(SortingFunction<Vehicle> function) {
        this.function = function;
    }

    SortingFunction<Vehicle> function() { return this.function; }

    // Implementation of equals() and hashCode(), which specify that two record objects are equal if they are of the same type and contain equal field values.
    public boolean equals...
    public int hashCode...

    // An implementation of toString() that returns a string representation of all the record class's fields, including their names.
    public String toString() {...}
}

*/
