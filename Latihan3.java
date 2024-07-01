public class Latihan3 {
    public static int recursiveMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min1 = recursiveMinimum(arr, n - 1);
        int min2 = arr[n - 1];
        return Math.min(min1, min2);
    }
    public static int iterativeMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 2, 3, 5};

        System.out.println("Mencari Elemen Terkecil dengan Rekursi:");
        System.out.println(recursiveMinimum(arr, arr.length));

        System.out.println("\nMencari Elemen Terkecil dengan Iterasi:");
        System.out.println(iterativeMinimum(arr));
    }
}