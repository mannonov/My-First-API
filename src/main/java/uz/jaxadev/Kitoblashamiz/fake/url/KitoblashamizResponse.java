package uz.jaxadev.Kitoblashamiz.fake.url;

public class KitoblashamizResponse {

    String phoneNumber;
    String password;

    public KitoblashamizResponse(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
