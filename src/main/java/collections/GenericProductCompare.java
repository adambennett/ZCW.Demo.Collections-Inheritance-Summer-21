package collections;

import inheritance.*;

import java.util.*;

public record GenericProductCompare(SortingFunction<Product> function) implements Comparator<Product>
{

    @Override
    public int compare(Product o1, Product o2)
    {
        return Integer.compare(function.comparison(o1), function.comparison(o2));
    }

}
