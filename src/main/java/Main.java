import Model.Exceptions.DataException;
import Model.Notebook;
import Model.Subcriber.Address;
import Model.Subcriber.Group;
import Model.Subcriber.Name;
import Model.Subcriber.Subscriber;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber(new Name("Eduard", "Tsemenko",
                "Yuriyovich"), "edmorso", Group.FAMILY,
                1,1,"edts@fas", "sad",
                new Address("Kyiv", "Balsaka", 2, 222), new Date());
        Notebook notebook = new Notebook();

        try {
            notebook.addSubscriber(subscriber);
        }catch (DataException de){
            de.printStackTrace();
        }

        System.out.println(notebook.getSubscriber(subscriber));
        System.out.println(subscriber.getName());
        System.out.println(subscriber.getAddress());
        System.out.println(subscriber.getCreationDate());

        try {
            Thread.sleep(5000);
        } catch (Exception e){
            e.printStackTrace();
        }

        Subscriber subscriber1 = new Subscriber(new Name("Eduard", "Tsemenko",
                "Yuriyovich"), "edmorso", Group.FAMILY,
                1,1,"edts@fas", "sad",
                new Address("Kyiv", "Balsaka", 2, 222), new Date());

        try {
            notebook.addSubscriber(subscriber1);
        }catch (DataException de){
            de.printStackTrace();
        }

        System.out.println(subscriber1.getCreationDate());
        System.out.println(subscriber.getCreationDate());
    }
}
