/*
for n = 4
pattern:
****
***
**
*

observations:
1. no. of rows = n
2. no. of stars in ith row = n - i + 1
*/

import java.util.*;

class InvertedHalfPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = n; i>0; i--) {
      for (int j = 1; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
/*
inverted but rotated by 180 degree along y axis
for n = 4
pattern:
   *
  **
 ***
****

observations:
1. no. of rows = n
2. spaces in ith row = n - i
3. stars in ith row = i
*/
			//using the same n
      for (int i = 1; i<=n; i++) {
        for (int spaces = 1; spaces<=(n-i); spaces++) {
					System.out.print(" ");
        }
        for (int stars = 1; stars<=i; stars++) {
					System.out.print("*");
        }
        System.out.println();
      }
  }
}