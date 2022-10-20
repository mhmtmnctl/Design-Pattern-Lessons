package CreationalDP.Abstract_FactoryDP;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");//fabrika oluştu

        Shape shape1= shapeFactory.getShape("circle");//circle objesi oluşturuldu
        shape1.draw();


        Shape shape2 = shapeFactory.getShape("rectangle");//rectangle objesi oluşturuldu
        shape2.draw();


        Shape shape3 = shapeFactory.getShape("square");//square objesi oluşturuldu
        shape3.draw();


        //color fabrikasını oluşturalım

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color color1 = colorFactory.getColor("red");//red objesi oluşturuldu
        color1.fill();

        Color color2 = colorFactory.getColor("blue");//blue objesi oluşturuldu
        color2.fill();

        Color color3 = colorFactory.getColor("green");//green objesi oluşturuldu
        color3.fill();

    }
}
