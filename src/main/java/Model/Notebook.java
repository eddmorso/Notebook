package Model;

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
}
