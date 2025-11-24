
package model;

import java.util.ArrayList;

public class User {
    private static int lastID; // Static variable to keep track of number of users
    private int userID; // Unique ID for each user
    private String Username; // User's username
    private String Name; // User's First Name
    private String lName; // User's Last Name
    private String Email; // User's Email
    private String Password; // User's Password
    private ArrayList<Restaurant> favoriteRestaurants; // List of User's favorite restaurants
    //private ArrayList<Review> reviews; // List of User's reviews  ---------- To be implemented //---------- to be implemented

    public User(String username, String name, String lName, String email, String password) {
        //Somehow find the last used ID from a file or database
        this.userID = lastID++;
        this.Username = username;
        this.Name = name;
        this.lName = lName;
        this.Email = email;
        this.Password = password;
        this.favoriteRestaurants = new ArrayList<>();

        lastID++;
    }

    //ToDo 
    // Remove favorite restaurant method 
    // Put into .json file method
    //  - Secure password method
    //  - Load from .json file method
    //  - Seperate .json file to hold reviews method
    // Login method
    // Signup method
    // 
    
    //------------- Getters and Setters -----------------
    public int getUserID() {return userID;}
    public String getUsername() {return Username;}
    public String getName() {return Name;}
    public String getlName() {return lName;}
    public String getEmail() {return Email;}
    public String getPassword() {return Password;}
    public ArrayList<Restaurant> getFavoriteRestaurants() {return favoriteRestaurants;}

    public void setuserID(int userID) {this.userID = userID; }
    public void setUsername(String username) {this.Username = username;}
    public void setName(String name) {this.Name = name;}
    public void setlName(String lName) {this.lName = lName;}
    public void setEmail(String email) {this.Email = email;}
    public void setPassword(String password) {this.Password = password;}
    public void addFavoriteRestaurant(Restaurant restaurant) {favoriteRestaurants.add(restaurant);
    }

    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Name='" + Name + '\'' +
                ", lName='" + lName + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
    
    
}
