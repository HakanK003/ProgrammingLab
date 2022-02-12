package loops;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        Boolean countinue =true;
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("Enter Item"+count+" and its price:");
            item =scan.next();
            price = scan.nextDouble();
            totalPrice+=price;
            shoppingListReport+="Item"+count+": "+item + " Price: "+price;
            count++;
            System.out.println("Add one more item?");
            String answer=scan.next();
            countinue = answer.equals("yes");


        }while(count<11&& countinue);

        scan.close();

        System.out.println(shoppingListReport);
        System.out.println("Total price: "+totalPrice);




    }
}
