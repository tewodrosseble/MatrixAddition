package Matrix;

<<<<<<< HEAD
public class MatrixAddition {
    public static void main(String args[]){

=======
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    //The first matrix
    System.out.print("Enter the number of rows of the first matrix: ");
    int row = input.nextInt();
    System.out.print("Enter the number of columns of the first matrix: ");
    int column = input.nextInt();
    int[][] matrix = new int[row][column];
//Accept elements of the first matrix
    for (int i=0;i<row;i++){
        for (int j=0;j<column;j++){
            System.out.print("Enter the "+i+j+" th element of the first matrix: ");
            matrix[i][j]=input.nextInt();
        }
    }
    //Display the first matrix
    System.out.println("The first matrix is : ");
    for (int s =0;s<row;s++){
        for (int r=0;r<column;r++){
            System.out.print(matrix[s][r]+"\t");
        }
        System.out.print("\n");
    }

//    The second matrix
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the no of rows of the second matrix: ");
        int row2 = input2.nextInt();
        System.out.print("Enter the no of columns of the second matrix: ");
        int column2 = input2.nextInt();
        int[][] matrix2 = new int[row2][column2];
//Accept elements of the second matrix
        for (int i=0;i<row2;i++){
            for (int j=0;j<column2;j++){
                System.out.print("Enter the "+i+j+" th element of the first matrix: ");
                matrix2[i][j]=input.nextInt();
            }
        }
//        Display the second matrix
        System.out.println("The second matrix is :");
        for (int p=0;p<row2;p++){
            for(int q=0;q<column2;q++){
                System.out.print(matrix2[p][q]+"\t");
            }
            System.out.print("\n");
        }
//        Operations
        System.out.println("\n\nAddition of matirces");
        for (int s =0;s<row;s++){
            for (int r=0;r<column;r++){
                System.out.print(matrix[s][r]+"\t");
            }
            System.out.print("\n");
        }
        System.out.print("\t+\n");
        for (int p=0;p<row2;p++){
            for(int q=0;q<column2;q++){
                System.out.print(matrix2[p][q]+"\t");
            }
            System.out.print("\n");
        }
        System.out.print("=\n");
        if (row==row2 && column==column2){
            int[][] addedMatrix = new int[row][column];
            System.out.println("The sum of the two matrices is : ");
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    addedMatrix[i][j] =matrix[i][j]+matrix2[i][j];
                    System.out.print(addedMatrix[i][j]+"\t");
                }
                System.out.print("\n");
            }
        }
        else {
            System.out.println("The matrices cannot be added");
        }
>>>>>>> cfa3801 (Initial commit)
    }
}
