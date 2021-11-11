package collections;

import inheritance.*;
import java.util.*;

public class Depot implements Iterable<Automobile>
{

    private final List<Automobile> docked;

    public Depot()
    {
        this.docked = new ArrayList<>();
    }

    public void park(Automobile automobile)
    {
        this.docked.add(automobile);
    }

    public boolean remove(Automobile automobile)
    {
        return this.docked.remove(automobile);
    }

    public List<Automobile> getDocked()
    {
        return this.docked;
    }

    public void sort()
    {
        Collections.sort(this.docked);
    }

    @SuppressWarnings("Java8ListSort")
    public void sort(SortingFunction<Automobile> func)
    {
        GenericAutomobileCompare compare = new GenericAutomobileCompare(func);
        Collections.sort(this.docked, compare);
    }

    @Override
    public Iterator<Automobile> iterator()
    {
        return this.docked.iterator();
    }

    @Override
    public String toString() {
        return this.docked.toString();
    }

}
