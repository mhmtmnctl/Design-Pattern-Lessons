package CreationalDP.FactoryDP;

public class ShapeFactory {

    public Shape getShape(String shapeType){

        if (shapeType==null){
            return null;//parametre null gelirse null gönderelim. yoksa kod patlar
        }
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
       else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }

        return null;// "a" gibi saçma bi değer gönderirse de null gönderelim.
    }
}