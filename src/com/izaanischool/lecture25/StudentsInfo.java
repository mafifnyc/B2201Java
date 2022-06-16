package com.izaanischool.lecture25;

import java.util.ArrayList;

public class StudentsInfo {
    // Declare an empty array with length 5
    // Length is Static - Fixed
    String[] students = new String[5];

    public static void main(String[] args) {
        StudentsInfo studentsInfo = new StudentsInfo();
        //studentsInfo.getStudentsInfo();
       // studentsInfo.createDynamicArray();
        studentsInfo.copyArrayToArrayList();
    }

    public String[] getStudentsInfo(){
        students[0] = "John";
        students[1] = "Don";
        students[2] = "Mon";
        students[3] = "Kon";
        students[4] = "KiKi";

//        for (int i = 0; i < students.length; i++){
//            System.out.println(students[i]);
//        }

        return students;

    }

    public ArrayList<String> createDynamicArray(){
        // I am going to create class named ArrayList
        // This class can have an dynamic array object
        // You can add as many element as you want
        // Arraylist can store any Object.
        // An array item/element has to be an Object

        int a  = 4; // What is a here?  Isn't it an object?

        // We created a dynamic array container, which can hold
        // String type of Object
        ArrayList< String > studentList = new ArrayList<>();

        studentList.add("John");
        studentList.add("Don");
        studentList.add("Mon");

        // Get value from an ArrayList
        // System.out.println(studentList.get(2));

        for (int i = 0; i< studentList.size(); i++){
            System.out.println(studentList.get(i));
        }

        return studentList;

    }

    public void copyArrayToArrayList(){
        System.out.println(students.length);
        getStudentsInfo();
        ArrayList<String>  newStudentList = new ArrayList<>();

        // 1. Get all the items from students static array
        // 2. Insert all the items from students static array into newStudentList

        for (int i = 0; i < students.length; i++){
            String student = students[i]; //
            newStudentList.add(student);
        }

        // for each loop/statement. Only works with Object
        // Do not have to define where to start and where to stop
        // It will start taking first element and end with last element

        // for(Type s :  targetObjectToIterate/ArrayList   )
        for( String s  : newStudentList ){    // s = John, Don, Mon, Kon, Kiki
            // Iterating using foreach loop
            System.out.println(s);
        }

        newStudentList.forEach( str  -> System.out.println(" Iterating using foreach() method " + str));

    }

}
