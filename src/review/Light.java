package review;

public class Light {

    public Light(){
        System.out.println("I am default constructor");
    }

    public void turnOnLight(){
        System.out.println("Turning on a light");
        // Write all your logics here. it could be 100 lines of code
    }

    public void turnOffLight(){
        System.out.println("Turning off light");
    }

    public void adjustLightIntensity(int percentage){
        System.out.println("Adjusted light intensity to " + percentage + "%");
    }

}
