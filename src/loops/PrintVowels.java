package loops;

import java.util.Scanner;

public class PrintVowels {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        inp.close();

        String vowels="";

        for(int i =0; i<word.length(); i++){
            String ch =""+word.charAt(i);
            if(ch.equalsIgnoreCase("a")||ch.equalsIgnoreCase("e")||ch.equalsIgnoreCase("o")||ch.equalsIgnoreCase("i")||ch.equalsIgnoreCase("u"))
            {vowels+=""+ch;}
        }

        System.out.println(vowels);

    }
}
