/*
for n = 4
pattern:
   ****
  ****
 ****
****

observations:
1. no. of rows = n
2. no. of stars in ith row = n
3. spaces in ith row = n - i
*/
import java.util.*;

class SolidRhombus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    for (int i = 1; i<=n; i++) {
      
      //for spaces
      for(int j = 1; j<=(n-i); j++) {
        System.out.print(" ");
      }

      //for stars
      for (int j = 1; j<=n; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}