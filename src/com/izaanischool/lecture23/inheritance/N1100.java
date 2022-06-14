package com.izaanischool.lecture23.inheritance;

public class N1100 extends PreN1100 {

    public void camera(){
        System.out.println("Take Photo....");
    }

    //  We just overloaded method camera()
    // Overloading happens in same Java Class
    public void camera(int zoomCapacity){
        System.out.println("Take Photo....");
        System.out.println("This Camera has  zoom capacity: " + zoomCapacity);
    }

    public static void main(String[] args) {
        N1100 myN1100 = new N1100();
        myN1100.call();// Invoking or calling method call() using the object myN1100
        myN1100.camera();
        myN1100.camera(4);
    }

    public void text(){
        System.out.println("Text to your ....... !!!");
    }
}
