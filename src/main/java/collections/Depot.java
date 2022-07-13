package collections;

import inheritance.*;
import java.util.*;

public class Depot implements Iterable<Vehicle>
{

    private final List<Vehicle> docked;

    public Depot()
    {
        this.docked = new ArrayList<>();
    }

    public void park(Vehicle vehicle)
    {
        this.docked.add(vehicle);
    }

    public boolean remove(Vehicle vehicle)
    {
        return this.docked.remove(vehicle);
    }

    public List<Vehicle> getDocked()
    {
        return this.docked;
    }

    public void sort()
    {
        Collections.sort(this.docked);
    }

    @SuppressWarnings("Java8ListSort")
    public void sort(SortingFunction<Vehicle> func)
    {
        GenericVehicleCompare comparator = new GenericVehicleCompare(func);
        Collections.sort(this.docked, comparator);
    }

    @Override
    public Iterator<Vehicle> iterator()
    {
        return this.docked.iterator();
    }

    @Override
    public String toString() {
        return this.docked.toString();
    }

}
