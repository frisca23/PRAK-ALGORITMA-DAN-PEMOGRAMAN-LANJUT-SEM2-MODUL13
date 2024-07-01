public class HitungNilai {
   public static int pangkat(int A, int B) {
      if (B == 0) {
         return 1;
      } else if (B == 1) {
         return A;
      } else {
         int result = 1;
         for (int i = 1; i <= B; i++) {
            result *= A;
         }
         return result;
      }
   }
   public static void main(String[] args) {
      int A = 5;
      int B = 3;
      int result = pangkat(A, B);
      System.out.println(A + " Pangkat " + B + " = " + result);
   }
}