public class ArrProdExceptSelf {
    public static void arrProd(int arr[]) {
        int res[] = new int[arr.length];

        for (int i = 0; i < res.length; i++) {
            int prod = 1;
            for (int j = 0; j < res.length; j++) {
                if (i != j) {
                    prod *= arr[j];
                }
            }
            res[i] = prod;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ",");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        arrProd(arr);
    }
}
