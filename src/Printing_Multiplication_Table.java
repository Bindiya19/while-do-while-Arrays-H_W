import java.util.Scanner;

//4. Printing multiplication table using do while loop
public class Printing_Multiplication_Table
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num =scanner.nextInt();
        int i=0;
        do
        {
          i++;
          System.out.println(num + " * " + i + " = " + num * i);}
            //do while for multiplication any number.
          while (i < 12) ;

    }
}

