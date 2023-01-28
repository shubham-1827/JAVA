/*
for n = 4
pattern:

*****
*   *
*   *
*****

observations:
1. no. of rows = n
2. first and last row has stars = n + 1
3. for other rows, only first and last column has stars.
*/

import java.util.*;

class HollowRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 1; i<=n; i++) {
      for(int j = 1; j<=n+1; j++) {

        if(i == 1 || i == n) 
					System.out.print("*");

        else if (j == 1 || j == n+1) 
        	System.out.print("*");
          
        else
        	System.out.print(" ");
      }
      System.out.println();
    }
  }
}