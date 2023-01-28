/*
for n = 4
pattern:
*
**
***
****

observations:
1. no. of rows = n
2. no. of stars in ith row = i
*/

import java.util.*;

class HalfPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 1; i<=n; i++) {
      for (int j = 1; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}