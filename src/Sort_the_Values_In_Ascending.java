import java.util.Scanner;

//WAP to enter array and sort the values in ascending order
public class Sort_the_Values_In_Ascending
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the size of an arreys");
        int size = scanner.nextInt();
        //declare sizeof an array
        int [] arrays= new int [size];
        System.out.println("Enter your elements in array.");

        // for loop input array values
        for (int i = 0; i < size; i++)
        {
            arrays[i]=scanner.nextInt();
        }
        for(int i = 0; i < size; i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arrays[i]>arrays[j])
                {int tempVal;
                    tempVal=arrays[i];
                    arrays[i]=arrays[j];
                    arrays[j]=tempVal;

                }
            }
        }
        for (int i = 0; i < size; i++){
            System.out.println(arrays[i]+" ");
        }




    }
}
