package Controller;

import Model.Notebook;
import Model.Subcriber.Address;
import Model.Subcriber.Name;
import View.Viewer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private Notebook notebook;
    private Viewer viewer;

    public Controller(Viewer viewer, Notebook notebook) {
        this.notebook = notebook;
        this.viewer = viewer;
    }

    public void start(){
        System.out.println("name " + checkName(new Name("Eduard", "t$", "Yuriyovich")));
        System.out.println("email " + checkEmail("eddmorso@gmail.com"));
        System.out.println("number " + checkPhoneNumber("+5482202"));
    }

    private boolean checkName(Name name){
        boolean firstName = Pattern.matches("[a-zA-Z]+", name.getName());
        boolean secondName = Pattern.matches("[a-zA-Z]+", name.getSurname());
        boolean lastName = Pattern.matches("[a-zA-Z]+", name.getLastName());

        return firstName && secondName && lastName;
    }

    private boolean checkNickname(String nickname){
        return Pattern.matches("[a-zA-Z0-9]+", nickname);
    }

//    public boolean checkGroup(){
//        return false;
//    }

    private boolean checkComment(String comment){
        return Pattern.matches("[a-zA-Z]*", comment);
    }

    private boolean checkTelephoneNumber(String number){
        return Pattern.matches("[+]&&[0-9]*", number);
    }

    private boolean checkPhoneNumber(String number){
        return Pattern.matches("[+]?[0-9]{7,}", number);
    }

    private boolean checkPhoneNumber2(String number){
        return Pattern.matches("[+]?[0-9]+", number);
    }

    private boolean checkEmail(String email){
        return Pattern.matches("[a-zA-Z&&[@]]+", email);
    }

    private boolean checkSkype(String skype){
        return Pattern.matches("[a-zA-Z]*", skype);
    }

    private boolean checkAddress(Address address){
        boolean city = Pattern.matches("[a-zA-Z]+", address.getCity());
        boolean street = Pattern.matches("[a-zA-Z]+", address.getStreet());
        boolean building = Pattern.matches("[a-zA-Z0-9]+", String.valueOf(address.getBuilding()));
        boolean apartment = Pattern.matches("[0-9]+", String.valueOf(address.getApartment()));

        return city && street && building && apartment;
    }
}
