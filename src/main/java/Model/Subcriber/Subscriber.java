package Model.Subcriber;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Subscriber {
    private final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
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
    private String creationDate;
    private String lastChangedDate;

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
        this.creationDate = formatter.format(creationDate);
        lastChangedDate = this.creationDate;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
        lastChangedDate = formatter.format(new Date());
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
        lastChangedDate = formatter.format(new Date());
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
        lastChangedDate = formatter.format(new Date());
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        lastChangedDate = formatter.format(new Date());
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        lastChangedDate = formatter.format(new Date());
    }

    public int getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(int phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
        lastChangedDate = formatter.format(new Date());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        lastChangedDate = formatter.format(new Date());
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
        lastChangedDate = formatter.format(new Date());
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        lastChangedDate = formatter.format(new Date());
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getLastChangedDate() {
        return lastChangedDate;
    }

    @Override
    public String toString() {
        return nickname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Subscriber){
            Subscriber subscriber = (Subscriber) obj;

            return subscriber.getNickname().equalsIgnoreCase(nickname);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return nickname.toLowerCase().hashCode();
    }
}
