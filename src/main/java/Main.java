import Controller.Controller;
import Model.Exceptions.DataException;
import Model.Notebook;
import Model.Subcriber.Address;
import Model.Subcriber.Group;
import Model.Subcriber.Name;
import Model.Subcriber.Subscriber;
import View.Viewer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();

        Controller controller = new Controller(new Viewer(), notebook);

        controller.start();
    }
}
