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

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public Subscriber getSubscriber(Subscriber subscriber){
        for (Subscriber s : subscribers){
            if(s.equals(subscriber)){
                return s;
            }
        }
        return null;
    }

    public void deleteSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void deleteAll(){
        subscribers.clear();
    }

    public ArrayList<Subscriber> getListOfSubscribers(){
        return subscribers;
    }
}
