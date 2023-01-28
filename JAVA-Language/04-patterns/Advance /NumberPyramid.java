/*
for n = 4
pattern :
   1
  2_2
 3_3_3
4_4_4_4

observations:
1. no. of rows = n
2. no. of spaces in ith row = n - i
3. no. of elements in ith row = 2*i -1
4. in every row even paces has a space and odd places has numbers.
*/
import java.util.*;

class NumberPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {

      //for spaces
      for (int j = 1; j<=(n-i); j++) {
				System.out.print(" ");
      }
      //for numbers.
      for (int j = 1; j<=(2*i-1); j++) {
				if (j%2 == 0) 
        	System.out.print(" ");
        else 
        	System.out.print(i);
      }
      System.out.println();
    }
  }
}