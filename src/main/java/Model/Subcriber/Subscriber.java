package Model.Subcriber;

import Model.Subcriber.Address;
import Model.Subcriber.Group;
import Model.Subcriber.Name;

import java.util.Date;

public class Subscriber {
    private Name name;
    private String nickname;
    private String comment;
    private Group group;
    private int telephoneNumber;
    private int phoneNumber;
    private int phoneNumber2;
    private String email;
    private String skype;
    private Address address;
    private Date creationDate;
    private Date lastChangedDate;

    public Subscriber(Name name, String nickname, Group group,
                      int phoneNumber, int telephoneNumber, String email,
                      String skype, Address address, Date creationDate){
        this.name = name;
        this.nickname = nickname;
        this.group = group;
        this.telephoneNumber = telephoneNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.creationDate = creationDate;
        lastChangedDate = creationDate;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(int phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }
}
