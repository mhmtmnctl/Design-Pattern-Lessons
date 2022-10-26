package BehavioralDP.ObserverDP;

public class Observer {

    public static void main(String[] args) {
        Observer observer = new Observer();
        observer.observerDemo();
    }

    private void observerDemo() {
        Channel channel1 = new NewsChannel();
        Channel channel2 = new NewsChannel();
        Channel channel3 = new NewsChannel();

        NewAgency agency = new NewAgency();
        agency.addObserver(channel1);
        agency.addObserver(channel2);
        agency.addObserver(channel3);

        agency.setNews("news 1");
        agency.setNews("news 2");
        agency.setNews("news 3");

        System.out.println("channel1 NEWS");
        channel1.printNews();
        System.out.println("***********");
        System.out.println("channel2 NEWS");
        channel2.printNews();
        System.out.println("***********");
        System.out.println("channel3 NEWS");
        channel3.printNews();
        System.out.println("***********");
    }
}
