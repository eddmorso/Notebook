package Model;

import Model.Subcriber.Subscriber;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<Subscriber> subscribers;

    public Notebook(){
        subscribers = new ArrayList<Subscriber>();
    }

    public Notebook(ArrayList<Subscriber> subscribers){
        this.subscribers = subscribers;
    }

    public ArrayList<Subscriber> getListOfSubscribers(){
        if (!subscribers.isEmpty()){
            return subscribers;
        } else {
            throw new RuntimeException("No subscribers were added");
        }
    }

    public void deleteSubscriber(Subscriber subscriber){
        if (!subscribers.isEmpty() && subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
        } else {
           throw new RuntimeException("No such subscriber detected");
        }
    }

    public void deleteAll(){
        subscribers.clear();
    }
}
