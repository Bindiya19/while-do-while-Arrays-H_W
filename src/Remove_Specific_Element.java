import java.util.Scanner;

//WAP to remove specific element from an array
public class Remove_Specific_Element {
    public static void main(String[] args) {
        int i, size ,location;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size.");
        //for size of array
        size = scanner.nextInt();

        int array[] = new int[size];// for limitation of elements according size of array.
        System.out.println("Enter elements.");

        for ( i = 0; i < size; i++) {

            array[i] = scanner.nextInt();
        }
        System.out.println("Enter element's location of array to remove. ");
         location = scanner.nextInt();//number of the location of element to remove from arrays.

        for (i = location; i > size; i++) ;// for
        {
           array[i]=array[i+1];
        }
        size--;
        for (i=0; i<size; i++){
            System.out.println(array[i]+"  ");
        }
    }
}