/*
for n = 4
pattern:
   *
  ***
 *****
*******
*******
 *****
  ***
   *

observations:
1. no. of rows in upper part = n
2. no. of spaces in ith row in upper part = n - i
3. no. of stars in ith row in upper part = 2*i - 1
(same for lower part as well)
*/
import java.util.*;

class Diamond {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
		
    //for upper part
    for (int i = 1; i<=n; i++) {
      //for spaces
			for (int j = 1; j<=(n-i); j++) {
        System.out.print(" ");
      }
      //for stars
      for (int j = 1; j<=(2*i-1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    //for lower part
    for (int i = n; i>=1; i--) {
      //for spaces
			for (int j = 1; j<=(n-i); j++) {
        System.out.print(" ");
      }
      //for stars
      for (int j = 1; j<=(2*i-1); j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

