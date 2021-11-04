package variables;

public class SecondsConverter {

    public static void main(String[] args) {

        int seconds = 32101;
        int secondsShow = seconds%60;            //1
        int secondsToMin = seconds/60;           //535
        int minutesShow = secondsToMin%60;       //55
        int hoursShow = secondsToMin/60;             //8


        System.out.println(hoursShow + " hours, " + minutesShow + " minutes, and " + secondsShow + " seconds");



    }

}

/*
import java.util.*;

class Main {
  public static void main(String[] args) {

    //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE. inputSeconds is already declared and given
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter seconds:");
    int inputSeconds = userInput.nextInt();

    // // CONTINUE WRITE YOUR CODE BELOW THIS LINE:


        int secondsShow = inputSeconds%60;
        int secondsToMin = inputSeconds/60;
        int minutesShow = secondsToMin%60;
        int hoursShow = secondsToMin/60;


        System.out.println(hoursShow + " hours, " + minutesShow + " minutes, and " + secondsShow + " seconds");




  }
}
 */
