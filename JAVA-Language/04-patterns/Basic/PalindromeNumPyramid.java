/*
for n = 4
pattern:
   1
  212
 32123
4321234

 observation:
1. no. of rows = n
2. no. of elements in descending = i
3. no. of elements in ascending = i - 1 (not including 1 in centre)
4. starting and ending element of ith row = i
*/
import java.util.*;

class PalindromeNumPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 1; i<=n; i++) {

      //for spaces
      for (int j = 1; j<=(n-i); j++) {
        System.out.print(" ");
      }

      //for descending 
      for(int j = i; j>=1; j--) {
        System.out.print(j);
      }

      //for acsending
      for(int j = 2; j<=i; j++) {
        System.out.print(j);
      }
			
      System.out.println();
    }
  }
}