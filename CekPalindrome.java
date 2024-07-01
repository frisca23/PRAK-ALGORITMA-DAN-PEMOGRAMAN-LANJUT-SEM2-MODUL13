import java.util.Scanner;
public class CekPalindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z]", "");
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) {
            System.out.println(input + " adalah palindrom");
        } else {
            System.out.println(input + " bukan palindrom");
        }
    }
}
