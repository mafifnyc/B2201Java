package com.izaanischool.lecture23;

public class LMSLogin {

    public void login(String url, String userName, String password){
        // check url
        // check username
        // check password
        // Allow log in if they are valid

        if (url.equals("https://izaanschool.moodlecloud.com/")){
            System.out.println(url + " is Valid URL");
        }
        else{
            System.out.println(url +" invalid URL");
        }

        // check username
        if (userName.equals("admin")){
            System.out.println(userName + " is a Valid User " );
        }
        else{
            System.out.println( userName + " is a invalid User");
        }

        // check password

        if (password.equals("junk124")){
            System.out.println( password + " valid password");
        }
        else{
            System.out.println(password + " is invalid password");
        }

       // System.out.println(" Log in using " + url + ", " + userName + ", "  + password  );

        if(url.equals("https://izaanschool.moodlecloud.com/") && userName.equals("admin") && password.equals("junk124")){
            System.out.println(" Log in using " + url + ", " + userName + ", "  + password  );
            System.out.println("User " + userName + " is a valid user");
        }
        else {
            System.out.println("Invalid Credentials!!! Try Later");
        }


    }

}
