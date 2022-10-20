package CreationalDP.SingletonDp;

public class SingletonPatternDemo {
    public static void main(String[] args) {

      //  SingletonObject object2= new SingletonObject();//bize ürettirmiyor. çünkü private yapmıştık

        SingletonObject object2= SingletonObject.getInstance();

        System.out.println(object2.message);
        object2.showMessage();

        //oluşan obje singleton mı test edelim
        SingletonObject object3= SingletonObject.getInstance();
        System.out.println(object3.message);



    }
}
