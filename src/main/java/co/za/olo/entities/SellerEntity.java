package co.za.olo.entities;

import org.mongojack.Id;

public class SellerEntity {

    @Id
    private String stallId = null;
    private String sellerName = null;
    private String emailAddress = null;
    private String password = null;
    private String location = null;
    private String stallName = null;
    private String picture = null;
    private String advertPicture = null;
    private int rating = 0;
    private String review = null;

    // stall id
    public SellerEntity stallId(String stallId){
        this.stallId = stallId;
        return this;
    }

    public void setStallId(String stallId) {
        this.stallId = stallId;
    }

    public String getStallId() {
        return stallId;
    }

    // sellerName
    public SellerEntity sellerName(String sellerName){
        this.sellerName = sellerName;
        return this;
    }
    public void setSellerName(String sellerName){
        this.sellerName = sellerName;
    }

    public String getSellerName() {
        return sellerName;
    }

    // emailAddress
    public SellerEntity emailAddress(String emailAddress){
        this.emailAddress = emailAddress;
        return this;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    //password
    public SellerEntity password(String password){
        this.password = password;
        return this;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    //location
    public SellerEntity location(String location){
        this.location = location;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //stall name
    public SellerEntity stallName(String stallName){
        this.stallName = stallName;
        return this;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public String getStallName() {
        return stallName;
    }

    //picture
    public SellerEntity picture(String picture){
        this.picture = picture;
        return this;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public SellerEntity advertPicture(String advertPicture){
        this.advertPicture = advertPicture;
        return this;
    }

    public String getAdvertPicture() {
        return advertPicture;
    }

    public void setAdvertPicture(String advertPicture) {
        this.advertPicture = advertPicture;
    }

    //stall rating
    public SellerEntity rating(int rating){
        this.rating = rating;
        return this;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    // stall review
    public SellerEntity review(String review){
        this.review = review;
        return this;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String rating) {
        this.review = rating;
    }
}
