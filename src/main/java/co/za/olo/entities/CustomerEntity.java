package co.za.olo.entities;

import org.mongojack.Id;

public class CustomerEntity {

    @Id
    private String userId = null;
    private String userName = null;
    private String emailAddress = null;
    private String password = null;
    private String location = null;

   //user id
    public CustomerEntity userId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    // user name
    public CustomerEntity userName(String userName){
        this.userName = userName;
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    // email address
    public CustomerEntity emailAddress(String emailAddress){
        this.emailAddress = emailAddress;
        return this;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    //user password
    public CustomerEntity password(String password){
        this.password = password;
        return this;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public CustomerEntity location(String location){
        this.location = location;
        return this;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

}
