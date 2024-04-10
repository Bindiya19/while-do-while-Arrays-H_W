import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

//Write a Java program to test the equality of two arrays.
public class Equality_Of_Two_Arrays {
    public static void main(String[] args) {


        int[] arrayNumber1 = {1, 2, 3, 4, 5};
        int[] arrayNumber2 = {1, 2, 3, 4 ,5};
        boolean arrayNum = Arrays.equals(arrayNumber1,arrayNumber2);


        if(arrayNum) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }

}
