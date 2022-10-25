package BehavioralDP.MediatorDP;

public class MessageActor implements Actor {

    String name ;
    Dispatcher dispatcher;

    public MessageActor(String name, Dispatcher dispatcher) {
        this.name = name;
        this.dispatcher = dispatcher;
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message : " + message);
    }
    //mesaj gönderme işlemi için dispatcher a yönlendiriyor
    @Override
    public void sendMessage(String topic, String message) {
        dispatcher.dispatch(topic, message);
    }
}