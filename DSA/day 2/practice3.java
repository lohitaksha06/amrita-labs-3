import java.util.*;

public class practice3 {
    // Function to count valid triangles
    static int sumOfTriangle(int[] arr) {
        int n = arr.length;
        int count = 0;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = arr[i], b = arr[j], c = arr[k];

                    // Correct triangle condition
                    if ((a + b > c) && (a + c > b) && (b + c > a)) {
                        System.out.println("It is a valid triangle with " + a + ", " + b + ", and " + c);
                        count++;
                    } else {
                        System.out.println("Not a triangle: " + a + ", " + b + ", " + c);
                    }
                }
            }
        }

        return count;
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7};
        int total = sumOfTriangle(arr);
        System.out.println("Total number of valid triangles: " + total);
    }
}

