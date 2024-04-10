import java.util.Scanner;

public class Transpose_Matrix_Of_2_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the rows and columns.");
        int rows = scanner.nextInt();
        int column = scanner.nextInt();

        int[][] numbers = new int[rows][column];
        System.out.println("Enter your numbers");

        //input rows
        for (int i = 0; i < rows; i++) {
            //System.out.println(i);

            //input column
            for (int j = 0; j < column; j++) {
                numbers[i][j] = scanner.nextInt();
                //System.out.println(j);
            }
        }
        //output for 2D
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {

                System.out.print(numbers[i][j] + "  ");
            }
            System.out.println();
        }
    }
}