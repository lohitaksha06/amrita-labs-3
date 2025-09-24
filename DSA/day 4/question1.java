import java.util.*;

// given a matrix if an element is 0, set its entire row and column 0. solve in lplace
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix size");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("enter elements");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[0][0] == 0 || arr[0][1] == 0 || arr[0][2] == 0) {
                    if (arr[0][0] == 0 || arr[1][0] == 0 || arr[2][0] == 0) {
                        System.out.println(arr[i][j] + "should be cleared");
                    }
                }
                if (arr[1][0] == 0 || arr[1][1] == 0 || arr[1][2] == 0) {
                    if (arr[0][1] == 0 || arr[1][1] == 0 || arr[2][1] == 0) {
                        System.out.println(arr[i][j] + "should be cleared");
                    }
                }
                if (arr[2][0] == 0 || arr[2][1] == 0 || arr[2][2] == 0) {
                    if (arr[0][2] == 0 || arr[1][2] == 0 || arr[2][2] == 0) {
                        System.out.println(arr[i][j] + "should be cleared");
                    }
                }

            }
        }
        sc.close();
    }
}