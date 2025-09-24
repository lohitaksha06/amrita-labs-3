public class itsuki {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };

        // add 5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
            System.out.println("added 5: " + arr[i]);
        }

        // reverse arr
        int reversed_arr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed_arr[arr.length - i] = arr[i];
        }

        // print odd
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

}
