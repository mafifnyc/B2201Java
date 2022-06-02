package review;

public class Car{

public static void main(String[] args){
// This application can write Hello in the console
  System.out.println("Hello");
   Light myCarCabinLight = new Light();
   /*myCarCabinLight.turnOnLight();

   // Turn off the light
   myCarCabinLight.turnOffLight();

   // Adjust light intensity
  myCarCabinLight.adjustLightIntensity(50);*/

  String time = "SunnyDay";

  if (time == "SunnyDay"){
    System.out.println("DO not turn on light");
    myCarCabinLight.turnOffLight();
  }
  else if(time == "CloudyDay"){
    System.out.println("Adjust the light until 30%");
    myCarCabinLight.adjustLightIntensity(30);
  }
  else if(time == "Night"){
    System.out.println("Trun on");
    myCarCabinLight.turnOnLight();
  }


  Brake myCarBrake = new Brake();
  myCarBrake.pressBreak(20);
  startCar(); // static key word -::: I am powerful, I do not need object help to be executed

  }
  // static key word -::: I am powerful, I do not need object help to be executed
  public static void startCar(){
    System.out.println("Car Started, Let's drive!!!!!");
  }

}
