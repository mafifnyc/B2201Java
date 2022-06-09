package com.izaanischool.lecture23;

public class LMSApp {

   final static String url = "https://izaanschool.moodlecloud.com/";
   final String userName = "admin";
   final String password = "junk124";

    public static void main(String[] args) {
        // Creating an object means creating an instance of the class
       LMSApp lmsApp = new LMSApp();
       // Re-Assigning the url value
        System.out.println("Initial URL value: " + url);
        //url = "https://izaanschool.moodlecloud.io/";
        System.out.println("After re-assigning URL value: " + url);
        //lmsApp.password = "jj";

        LMSLogin lmsLogin = new LMSLogin();
        lmsLogin.login(url, lmsApp.userName, lmsApp.password  );
        // key word static has removed the requirements of creating an object explicitly
        secure();
        // Static filed can be called by class name
       String courseName = LMSCourse.courseName;
    }

    public static void secure(){
        System.out.println("Enhance Security!!!");
    }
}
