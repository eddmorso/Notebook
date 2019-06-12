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
        notebook.addSubscriber(subscriber);
        System.out.println(notebook.getSubscriber(subscriber));
        System.out.println(subscriber.getName());
        System.out.println(subscriber.getAddress());
        Subscriber subscriber1 = new Subscriber(new Name("Eduard", "Tsemenko",
                "Yuriyovich"), "edmorso", Group.FAMILY,
                1,1,"edts@fas", "sad",
                new Address("Kyiv", "Balsaka", 2, 222), new Date());
        notebook.addSubscriber(subscriber1);
    }
}
