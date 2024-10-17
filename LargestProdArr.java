public class LargestProdArr {
    public static int largestProdArr(int arr[]) {
        // if (arr.length == 1)
        // return arr[0];

        // int prod = 1;
        // int max = arr[0];

        // for (int i = 0; i < arr.length; i++)

        // {
        // prod *= arr[i];
        // max = Math.max(max, prod);

        // if (prod < 0) {
        // prod = 1;
        // }
        // }
        // return max;

        int res = arr[0];
        int curMin = 1, curMax = 1;

        for (int i = 0; i < arr.length; i++) {
            int tmp = curMax * arr[i];
            curMax = Math.max(Math.max(arr[i] * curMax, arr[i] * curMin), arr[i]);
            curMin = Math.min(Math.min(tmp, arr[i] * curMin), arr[i]);
            res = Math.max(res, curMax);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 4 };
        System.out.println(largestProdArr(arr));
    }
}
