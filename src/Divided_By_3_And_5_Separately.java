import java.util.Scanner;

public class Divided_By_3_And_5_Separately {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number between 1 to 100, to print the divide by 3 and 5. ");
        int number =scanner.nextInt();
        int i =1;

         while (i<number){
             i++;
             //for (int i = 1; i <=number; i++)//
             if(i % 3 == 0 && i % 5==0)

                System.out.println(i);
            }
    }
}
