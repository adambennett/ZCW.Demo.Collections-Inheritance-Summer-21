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
