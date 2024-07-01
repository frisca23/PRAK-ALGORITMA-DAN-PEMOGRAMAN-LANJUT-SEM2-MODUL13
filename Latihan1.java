public class Latihan1 {
    public static void printArrayRecursive(int[] arr, int i, int n) {
        if (i == n) {
            return;
        }
        System.out.print(arr[i] + " ");
        printArrayRecursive(arr, i + 1, n);
    }
    public static void printArrayIterative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Elemen Array dengan Rekursi = ");
        printArrayRecursive(arr, 0, arr.length);

        System.out.println("\nElemen Array dengan Iterasi = ");
        printArrayIterative(arr);
    }
}