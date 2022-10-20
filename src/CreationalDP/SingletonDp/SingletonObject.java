package CreationalDP.SingletonDp;

public class SingletonObject {

    String message = "Merhaba";
    private static SingletonObject instance = new SingletonObject();

    private SingletonObject(){//private const yaptık default olarak. başka yerden ulaşılamasın.interviewde çıkar

    }
    public static SingletonObject getInstance(){
        return instance;
    }

    public void showMessage(){//test etmek için yazdık. zorunlu değil
        this.message=this.message+" Batch 82";
        System.out.println(this.message);
    }

}
