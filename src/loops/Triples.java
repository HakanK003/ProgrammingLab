package loops;

import java.util.Scanner;

public class Triples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE

        scan.close();

        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i,i+3).equals(""+str.charAt(i)+str.charAt(i)+str.charAt(i))){count+=1;}
        }

        System.out.println(count);



    }
}
