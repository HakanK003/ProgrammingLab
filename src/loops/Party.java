package loops;

import java.util.Scanner;

public class Party {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // your code
        // ----------Scanner--------------------------

        String guests="";
        boolean a=true;

        do{
            System.out.println("Please enter guest name");
            guests+=input.nextLine();
            System.out.println("Do you want to enter new guest name:");
            String answer=input.nextLine();
            if(answer.equalsIgnoreCase("yes")){a= true; guests+=", ";}
            if(answer.equalsIgnoreCase("no")){a= false; input.close(); System.out.println(guests);}
        }while(a);


    }

}
