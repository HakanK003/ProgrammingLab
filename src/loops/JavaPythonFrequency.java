package loops;

import java.util.Scanner;

public class JavaPythonFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        scan.close();

        int frequencyJava=0;
        int frequencyPython=0;

        for(int i=0; i<sentence.length()-3; i++){
            if(sentence.substring(i,i+4).equals("java"))
            {frequencyJava++;}
        }
        for(int a=0; a<sentence.length()-5; a++){
            if(sentence.substring(a,a+6).equals("python"))
            {frequencyPython++;}
        }

        boolean a=true;

        if(frequencyJava==frequencyPython){a=true;}
        else{a=false;}

        System.out.println(a);




    }
}
