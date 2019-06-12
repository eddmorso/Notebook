package Model;

import Model.Exceptions.DataException;
import Model.Subcriber.Address;
import Model.Subcriber.Group;
import Model.Subcriber.Name;
import Model.Subcriber.Subscriber;

import java.util.ArrayList;
import java.util.Date;

public class Notebook {
    private ArrayList<Subscriber> subscribers;

    public Notebook(){
        subscribers = new ArrayList<Subscriber>();
    }

    public Notebook(ArrayList<Subscriber> subscribers){
        this.subscribers = subscribers;
    }

    public void addSubscriber(Subscriber subscriber) throws DataException{
        if (subscribers.contains(subscriber)) {
            throw new DataException("Subscriber " + subscriber + " already exists");
        }
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

    public Subscriber createSubscriber(Name name, String nickname, Group group,
                                       int phoneNumber, int telephoneNumber, String email,
                                       String skype, Address address, Date creationDate){
        return new Subscriber(name, nickname, group, phoneNumber,
                telephoneNumber, email, skype, address, creationDate);
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
