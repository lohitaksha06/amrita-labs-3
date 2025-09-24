import java.util.*;

public class practice8 {
    //write a program to check whether a matrix is an identity matrix
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        
        int[][] harry = new int[n][n];
        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                harry[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < n; i++ ){
            for(int j = 0; j < n; j++){
                if(i == j && harry[i][j] != 1){
                    System.out.println("not an identity matrix");
                    return;
                
                }
                if(i != j && harry[i][j] != 0 ){
                    System.out.println("not an identity matrix");
                    return;
                }

            }
        }
        System.out.println("This is identity matrix");
        sc.close();
    }
}
