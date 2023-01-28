/*
for n = 4
pattern:
1
2 3
4 5 6
7 8 9 10

observations:
1. no. of rows = n
2. no. of numbers in ith row = i
3. numbers are always increasing (no reset)
*/

import java.util.*;

class FloydTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
		
    //this will always increase
    int temp_val = 1;

    for(int i = 1; i<=n; i++) {
      for (int j = 1; j<=i; j++) {
        System.out.print(temp_val + " ");
        temp_val++;
      }
      System.out.println();
    }
  }
}