package inheritance;

public class Truck extends Vehicle
{

    private int weight;
    private final int reloadWeight;

    public Truck(int wheels, int seats)
    {
        super(wheels, seats, 100);
        this.reloadWeight = (wheels - 4) * 500;
    }

    @Override
    public void speedUp(int increment)
    {
        increment *= this.weightModifier();
        super.speedUp(increment);
    }

    @Override
    public int getSalesPrice() {
        return 50000;
    }

    private float weightModifier()
    {
        return this.weight * 0.55f;
    }

    public boolean reload()
    {
        if (this.getSpeed() > 0)
        {
            return false;
        }

        this.setWeight(this.reloadWeight);
        return true;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

}
