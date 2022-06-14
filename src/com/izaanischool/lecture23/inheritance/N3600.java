package com.izaanischool.lecture23.inheritance;

public class N3600 extends N1100  {

   public void camera(int focus){
       System.out.println(  "focus " + focus + "percentage");
   }

    public static void main(String[] args) {
        N3600 n3600 = new N3600();
        n3600.text();
        //n3600.camera();
        n3600.call();


    }
}
