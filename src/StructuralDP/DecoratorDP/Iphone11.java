package StructuralDP.DecoratorDP;

public class Iphone11 extends PhoneDecorator {
    public Iphone11(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + " 11";
    }
}
