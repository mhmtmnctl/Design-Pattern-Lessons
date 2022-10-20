package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        /*
        Bu yapı istenen bir yapı değil

        Circle circle1=new Circle();
        circle1.draw();
        */
        /*
        bana ne istediğini söyle sana göndereyim...
        üretmem gereken her şekli domain sınıı-nı bilmem gerekmiyor.
        peki bu sınıflara ihtiyaç olmadan obje üretebilseydik....
         */
        ShapeFactory shapeFactory = new ShapeFactory();//bütün talepleri bunun üzerinden yapcaz. fabrikayı kurduk
        Shape shape1 = shapeFactory.getShape("circle");//ben circle istiyorum
        shape1.draw();

        Shape shape2= shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3= shapeFactory.getShape("square");
        shape3.draw();
    }
}
