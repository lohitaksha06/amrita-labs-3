

public class afa {
    // first function
    static int getSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                System.out.println(arr[i] + " is greater than largest which has the value " + largest);
                largest = arr[i];
                System.out.println(" now largest has the value " + largest);

            } else if (arr[i] < largest) {
                System.out.println(arr[i] + " is smaller than " + largest + " so largest value will not change");
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }
        return secondLargest;
    } // end of function

    // function 2
    static int findMin(int[] arr) {
        int b = arr.length;
        int smallest = 1000;
        for (int i = 0; i < b; i++) {
            if (arr[i] < smallest) {
                System.out.println(arr[i] + "is smaller than smallest which has value" + smallest);
                smallest = arr[i];
                System.out.println("Now the smallest value is " + smallest);
            } else if (arr[i] > smallest) {
                System.out.println(arr[i] + " is larger than " + smallest);
            }

        }
        return smallest;
    }// end of function

    // main function
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1, 37 };
        System.out.println(getSecondLargest(arr));
        int[] arr1 = {56, 32, 45, 52, 10, 11};
        System.out.println(findMin(arr1));
    }
}
