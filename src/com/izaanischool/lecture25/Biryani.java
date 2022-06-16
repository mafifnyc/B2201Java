package com.izaanischool.lecture25;

public class Biryani {

    public static void main(String[] args) {

        String [] elements = {"rice", "masala", "oil","chicken","potato","onion","yogurt","chilli powder","turmeric","ghea","salt"};
        int i;

        for (i=0; i< elements.length; i++) {

            System.out.println(elements[i]);
        }
        String[] cookingStep= new String[4];

        try {
            //  1. Problem may occur in this block of the code.
            cookingStep[0] = "Heat the oil, then put onion and cook until it's turn brown";
            cookingStep[1] = "put one bay leaf, four green cardamoms, six cloves and then add marinated chicken";
            cookingStep[2] = "While cooking chicken, add plan yogurt, garam masala, red chili";
            cookingStep[3] = "wait for everything well cooked and then add rice all over the chicken, put water and salt";
            cookingStep[4] = " level the rice gently on top and at the end, fried onion can be added";
        // if you find any problem put it in Problem type container
            // Problem ~ Exception
        }
        catch (Exception e){
            // Catch all the problems you may find in the try lock
            System.out.println("Customer Message: You are making invalid entry!!!!");
            e.printStackTrace();
        }

        finally {
            System.out.println("This is final message!!!");
            // Execute some method in this as part of the application.
        }




        // java.lang.ArrayIndexOutOfBoundsException

        for (i=0; i< cookingStep.length; i++);
            System.out.println(i);

    }

}
