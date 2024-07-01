public class Latihan2 {
    public static String stringReverseRecursive(String str, int n) {
        if (n == 0) {
            return "";
        }
        return str.charAt(n - 1) + stringReverseRecursive(str, n - 1);
    }
    public static String stringReverseIterative(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i <= j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "IDTU";

        System.out.println("Membalikkan String dengan Rekursi =");
        System.out.println(stringReverseRecursive(str, str.length()));

        System.out.println("\nMembalikkan String dengan Iterasi =");
        System.out.println(stringReverseIterative(str));
    }
}