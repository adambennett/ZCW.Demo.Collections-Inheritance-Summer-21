package collections;

@FunctionalInterface
public interface SortingFunction<T>
{

    int comparison(T input);

}
