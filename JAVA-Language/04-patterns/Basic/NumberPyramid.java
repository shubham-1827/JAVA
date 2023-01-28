/*
for n = 4
Pattern:
   1
  22
 333
4444

observations:
1. no. of rows = n
2. no. of numbers in ith row = i
3. no. of spaces = n - i
4. values in ith row = i
*/
import java.util.*;

class NumberPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    for (int i = 1; i<=n; i++) {

      //for spaces
      for (int j = 1; j<=n-i; j++) {
				System.out.print(" ");
      }

      //for numbers
      for (int j = 1; j<=i; j++) {
        System.out.print(i);
			}
      System.out.println();
    }
  }
}