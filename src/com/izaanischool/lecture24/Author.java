package com.izaanischool.lecture24;

// Author Class has inherited Object class
public class Author  {
    // String name = "jack"; int x = 3;
    // Instance variables
    // where we have assigned some value of String varibale
    // firstName = some-value???????????
    public String firstName, lastName;
    // Constructor
    public Author(String firstName, String lName) {
        this.firstName = firstName;// Jamal
        this.lastName = lName;  // Azad
    }
    //    Instance methods
    public String getFirstName() {
        //firstName = "Jamal";
        return firstName;
    }
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + "Junk";
    }
    public static void main(String[] args) {
        //String firstName = "Jack";
        // create instance
        Author author = new Author("Jamal", "Azad");
        System.out.println(author);// print author => call toString method
        // Jamal Azad
        System.out.println(author.getFirstName());
    }
}



