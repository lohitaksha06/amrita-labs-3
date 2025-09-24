// write a java program to multiply two matrices 
import java.util.*;
public class practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the next number: ");
        int n = sc.nextInt();
        int[][] harry = new int[n][n];
        int[][] barry = new int[n][n];
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                harry[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                barry[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }
}
