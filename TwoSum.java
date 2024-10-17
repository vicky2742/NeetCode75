
public class TwoSum {

    public static void twoSum(int arr[], int target) {
        // !pairs
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // System.out.print("(" + arr[i] + "," + arr[j] + ")");
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
            // System.out.println();
        }
    }

    // public static int[] twoSums(int arr[], int target) {
    // // !pairs
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] + arr[j] == target) {
    // return new int[] { i, j };
    // }
    // }
    // }
    // return new int[] {};
    // }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int  target = 9;
        twoSum(arr, target);
    }
}
