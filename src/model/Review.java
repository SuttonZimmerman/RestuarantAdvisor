package model;
public class Review{
    private int rating; // Rating given in the review
    private String comment; // Comment provided in the review
    private User user; // User who wrote the review
    private Restaurant restaurant; // Restaurant being reviewed

    public Review() {
        this.rating = 0;
        this.comment = "";
        this.user = null;
        this.restaurant = null;
    }

    public Review(int rating, String comment, User user, Restaurant restaurant) {
        this.user = user;
        this.restaurant = restaurant;
        this.rating = rating;
        this.comment = comment;
    }

    public void writeReview(User user, Restaurant restaurant) {
        // Placeholder for writing review logic
        System.out.println("Review written by " + user.getUsername() + " for " + restaurant.getName());
    }

    //------------- Getters and Setters -----------------
    public int getRating() {return rating;}
    public String getComment() {return comment;}
    public User getUser() {return user;}
    public Restaurant getRestaurant() {return restaurant;}
    public void setRating(int rating) {this.rating = rating;}
    public void setComment(String comment) {this.comment = comment;}
    public void setUser(User user) {this.user = user;}
    public void setRestaurant(Restaurant restaurant) {this.restaurant = restaurant;}

    public String toString() {
        return "Review{" +
                "rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}