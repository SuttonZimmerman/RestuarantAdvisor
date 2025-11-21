package model;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String City;
    private String state;
    //private CuisineType cuisineType;     // ---------- To be implemented
    //private PriceRange priceRange;          //  ---------- To be implemented
    private double rating;
    private int numOfReviews;
    private double collectReviews;
    private ArrayList<Review> reviews;    //---------- To be implemented
    //private Menu menu;                    // ---------- To be implemented

    public Restaurant(String name, String city, String state, double rating) {
        this.name = name;
        this.City = city;
        this.state = state;
        this.rating = rating;
        this.reviews = new ArrayList<>();
        this.numOfReviews = 0;
        //this.menu = new Menu();
    }

    //------------- Getters and Setters -----------------
    public String getName() {return name;}
    public String getCity() {return City;}
    public String getState() {return state;}
    public double getRating() {return rating;}
    public int getNumOfReviews() {return numOfReviews;}
    public ArrayList<Review> getReviews() {return reviews;}

    public void setRating(double rating) {this.rating = rating;}
    public void setName(String name) {this.name = name;}
    public void setCity(String city) {City = city;}
    public void setState(String state) {this.state = state;}
    public void setNumOfReviews(int numOfReviews) {this.numOfReviews = numOfReviews;}

    public void updateReviews(Review review) {        //---------- To be implemented
        Review newReview = new Review(); //Temp
        numOfReviews++;
        collectReviews += review.getRating();
        rating = collectReviews / numOfReviews;
        reviews.add(newReview);
    }

    public void addToMenu(/*MenuItem item*/) {      //---------- To be implemented
        //menu.addItem(item);
    }

    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", City='" + City + '\'' +
                ", state='" + state + '\'' +
                ", rating=" + rating +
                '}';
    }

    
}
