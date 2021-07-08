package collections;

import inheritance.*;

import java.util.*;

public record GenericAutomobileCompare(SortingFunction function) implements Comparator<Automobile>
{

    @Override
    public int compare(Automobile o1, Automobile o2)
    {
        return Integer.compare(function.comparison(o1), function.comparison(o2));
    }

}
