import java.util.Scanner;

public class Input_5_Digit_Number_And_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tne numbers of digit you want?");
        int num = scanner.nextInt();
        int[] array_element = new int[num];

        for (int i = 0; i < num; i++)
       {
           System.out.println("Enter your digit "+ (i+1));
           array_element[i] = scanner.nextInt();
       }
        System.out.println("You entered:");
               for (int i = 0; i < num; i++) {
          System.out.println(array_element[i]+"  ");
        }
        System.out.println("Reversed digits are:");
        for (int i = num-1; i >=0; i-- ){
            System.out.println(array_element[i]+"  ");
        }


    }
}