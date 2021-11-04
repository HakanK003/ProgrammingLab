package variables;

public class SchoolGrades {

    public static void main(String[] args) {

        double no1= 5;
        double no2= 3;
        double no3= 4;
        double no4= 2;
        double no5= 5;

        double avarage = (no1+no2+no3+no4+no5)/5;

        System.out.println(avarage);

    }
}

/*
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    ////DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE. Variables are already declared and given
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Grader!\nPlease enter subject name number 1 and score for this subject");
    String subject1 = input.next();
    double grade1 = input.nextDouble();

    System.out.println("Please enter subject name number 2 and score for this subject");
    String subject2 = input.next();
    double grade2 = input.nextDouble();

    System.out.println("Please enter subject name number 3 and score for this subject");
    String subject3 = input.next();
    double grade3 = input.nextDouble();

    System.out.println("Please enter subject name number 4 and score for this subject");
    String subject4 = input.next();
    double grade4 = input.nextDouble();

    System.out.println("Please enter subject name number 5 and score for this subject");
    String subject5 = input.next();
    double grade5 = input.nextDouble();

    // CONTINUE WRITE YOUR CODE BELOW THIS LINE:

  double avarage = (grade1+grade2+grade3+grade4+grade5)/5;


  System.out.println("Summary:" + " " + subject1 + " - " + grade1 + "," +" " + subject2 + " - " + grade2 + "," + " " + subject3 + " - " + grade3 + "," + " " + subject4 + " - " + grade4 + "," + " " + subject5 + " - " + grade5 + "\nYour average score is: " + avarage + "\nThank you for using Grader!\nGoodbye!");


  }
}
 */