package collections;

import java.util.*;

public record GenericCompare<T>(SortingFunction<T> function) implements Comparator<T>
{
    @Override
    public int compare(T o1, T o2)
    {
        return Integer.compare(function.comparison(o1), function.comparison(o2));
    }

}

// The 'record' keyword creates a class that looks something like the definition below

/*


public final class GenericCompare<T> implements Comparator<T> {

    private final SortingFunction<T> function;

    public GenericCompare(SortingFunction<T> function) {
        this.function = function;
    }

    SortingFunction<T> function() { return this.function; }

    // Implementation of equals() and hashCode(), which specify that two record objects are equal if they are of the same type and contain equal field values.
    public boolean equals...
    public int hashCode...

    // An implementation of toString() that returns a string representation of all the record class's fields, including their names.
    public String toString() {...}
}

*/
