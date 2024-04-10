

//Write a Java program to find the common elements between two arrays (string values).
public class Common_Elements {
    public static void main(String[] args) {
        int[] array1 ={ 11, 22, 33, 44, 55};
        int[] array2 ={ 55, 44, 88, 99, 22};

           //iterating array1
        for(int i = 0;i < array1.length;i++) {
            //iterating array2
            for (int j = 0;j < array2.length; j++)
            {
            if (array1[i] == array2[j])
                System.out.println(array1[i] + " ");
            }
        }
    }
}
