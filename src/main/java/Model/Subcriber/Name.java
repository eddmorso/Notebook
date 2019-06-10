package Model.Subcriber;

public class Name {
    private String name;
    private String surname;
    private String lastName;
    private String vocative;

    public Name(String name, String surname, String lastName){
        this.name = name;
        this.surname = surname;
        this.lastName = lastName;
        vocative = surname + " " + name.charAt(0) + ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVocative() {
        return vocative;
    }

    public void setVocative(String vocative) {
        this.vocative = vocative;
    }

    @Override
    public String toString() {
        return vocative;
    }
}
