import java.util.concurrent.CompletableFuture;

public class Computer {

    public static void main(String[] args) {
        Computer myComputer = new Computer();
        // When we work we would like to keep computer on
        // When we are done with the work we would like to turn off computer
        boolean workTime = true; //Not Working Tim
        // if statement example 01
        myComputer.ifDemoExample01(myComputer, workTime);

        Computer noshinsComputer = new Computer();

        boolean noshinWorkStatus = true;
        noshinsComputer.ifDemoExample02(noshinsComputer, noshinWorkStatus );

    }

    public void ifDemoExample01(Computer computer, boolean workStatus){

        if (workStatus){
            // When we work we would like to keep computer on
            computer.turnOn();
        }

        else if (workStatus){
            // When we are done with the work we would like to turn off computer
            computer.turnOff();
        }
    }

    public void ifDemoExample02(Computer computer, boolean workStatus ){
        if (workStatus) { // workTime --> true / false
            System.out.println("This is work time");
            computer.turnOn();
        }
        else {
            System.out.println("It's not work time, let's turn off the machine");
            computer.turnOff();
        }
    }

    public void ifDemoExample03(){

    }

    public void turnOn(){
        System.out.println("Computer is on");
    }

    public void turnOff(){
        System.out.println("Computer is off");
    }

    public void openEmailApp(){
        System.out.println("Open Email App");
    }

    public void readEmail(){
        System.out.println("Read Email");
    }

    public void replyEmail(){
        System.out.println("Reply Email");
    }

}
