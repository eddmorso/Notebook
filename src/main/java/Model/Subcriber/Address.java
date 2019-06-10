package Model.Subcriber;

public class Address {
    private String city;
    private String street;
    private int building;
    private int apartment;
    private String wholeAddress;

    public Address(String city, String street, int building, int apartment){
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartment = apartment;
        wholeAddress = city + " " + street + " " + building + " " + apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String getWholeAddress() {
        return wholeAddress;
    }

    public void setWholeAddress(String wholeAddress) {
        this.wholeAddress = wholeAddress;
    }

    @Override
    public String toString() {
        return wholeAddress;
    }
}
