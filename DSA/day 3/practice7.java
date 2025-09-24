import java.util.*;
// write a program to print the upper and lower triangular parts of a square matrix
public class practice7 {
    public static void main(String[] args) {
        Scanner harry = new Scanner(System.in);
        System.out.print("enter the size of square matrix: ");
        int n = harry.nextInt();
        
        int[][] arr = new int[n][n];
        
        
        System.out.println("Enter the matrix elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = harry.nextInt();
            }
        }
        
        System.out.println("Upper triangular matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j >= i) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
        System.out.println("\nLower triangular matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j <= i) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        harry.close();
    }
}
