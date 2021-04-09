package uz.jaxadev.Kitoblashamiz.fake.url.model;

public class UserSignUp {

    String fNameLName;
    String userName;
    String birthOfDate;
    String phoneNumber;
    String password;

    public UserSignUp(String fNameLName, String userName, String birthOfDate, String phoneNumber, String password) {
        this.fNameLName = fNameLName;
        this.userName = userName;
        this.birthOfDate = birthOfDate;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getfNameLName() {
        return fNameLName;
    }

    public void setfNameLName(String fNameLName) {
        this.fNameLName = fNameLName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
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
