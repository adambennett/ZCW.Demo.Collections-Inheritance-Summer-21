package collections;

import inheritance.*;

@FunctionalInterface
public interface SortingFunction<T>
{

    int comparison(T input);

}
