package lloops;
import java.util.Scanner;

public class odd_even_num_from_n {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
       
        System.out.print("User please enter a number: ");
        int number = x.nextInt();
        
       
        System.out.println("Odd numbers in descending order from "+number);
        int i = number;
        while (i >= 0) {
            if (i % 2 != 0) {
                System.out.print(i + " \n");
            }
            i--;
        }
        
       
       
        System.out.println("Even numbers in descending order from "+number);
        i = number; 
        while (i >= 0) {
            if (i % 2 == 0) {
                System.out.print(i +"\n");
            }
            i--;
        }
        
       
    }
}
