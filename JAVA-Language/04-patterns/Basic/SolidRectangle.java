/*
for n = 4

pattern:
****
****
****
****

observations:
1. no. of rows = n
2. number of stars in ith row = n + 1
*/

import java.util.*;

class SolidRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    for (int i = 1; i<=n; i++) {
      for(int j = 1; j<=n+1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}