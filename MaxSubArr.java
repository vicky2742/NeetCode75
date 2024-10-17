public class MaxSubArr {
    public static int maxSubArr(int arr[]) {
        if (arr.length == 1)
            return arr[0];

        int sum = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++)

        {
            sum += arr[i];
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { 2, -3, 4, -2, 2, 1, -1, 4 };
        System.out.println(maxSubArr(arr));
    }
}
