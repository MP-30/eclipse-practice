import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class Arraylist {
    public static void main(String... strings){

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0;i<100;i++){
           arr.add((int)(Math.random()*1000)) ;

        }
        System.out.println("List of number:");
        System.out.println(arr);
        int a;
        try(Scanner in = new Scanner(System.in))
        {
            System.out.println("Please, enter an int value from above list: ");
            a = in.nextInt();
        }
        if(arr.contains(a)){
            System.out.println("Found!");
        }
        else {
            System.out.println("Number not found in List, Sorry!!");
        }

         }
}
