package methods;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheckerIgnoreCase {
    public static boolean isAnagram(String word1, String word2) {

        boolean a =false;

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        Arrays.sort(ch1); Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        String str1="";
        String str2="";

        for(char each: ch1){str1+=each+"";}
        for(char each: ch2){str2+=each+"";}
        System.out.println(str1);
        System.out.println(str2);
        if (str1.equalsIgnoreCase(str2)){a=true;}
        return a;

    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
        in.close();
    }

}
