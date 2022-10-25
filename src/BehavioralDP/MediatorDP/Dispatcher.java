package BehavioralDP.MediatorDP;

// dağıtım işini yapacak interface
public interface Dispatcher {

    void dispatch(String topic , String message );
}