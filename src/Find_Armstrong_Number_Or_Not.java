import java.util.Scanner;

//WAP to input any number and find out if its Armstrong number or not?
public class Find_Armstrong_Number_Or_Not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find out if it is Armstrong number or not? ");
        int number = scanner.nextInt();


        int i = number;
        int length=0;
        while (i!=0)
        {
            length=length+1;
            i=i/10;
        }
        int i2=number;
        int aemstrong=0;
        while (i2!=0)
        {
            int mul=1;
            int rem = i2 % 10;
            for (int j=1; j<=length; j++)
            {
                mul=mul*rem;
            }
            aemstrong = aemstrong + mul;
            i2=i2/10;
        }
        if(aemstrong==number){
            System.out.println(number+" is Armstrong number.");
        }
        else {
            System.out.println(number+" is not Aemstrong number.");
        }

    }
}
