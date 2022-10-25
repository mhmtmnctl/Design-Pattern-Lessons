package StructuralDP.DecoratorDP;

public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+" Max";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+100;
    }

}
