/*
for n = 4
pattern:
1
12
123
1234

observations:
1. no. of rows = n
2. no. of numbers in ith row = i
*/

import java.util.*;

class NumberHalfPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 1; i<=n; i++) {
      for (int j = 1; j<=i; j++) {
        System.out.print(j + " "); //just to give some nice looks
      }
      System.out.println();
    }

    //inverted one:
    /*
    for n = 4
    pattern:
    1234
    123
    12
    1
    */
    for(int i = n; i>0; i--) {
      for (int j = 1; j<=i; j++) {
        System.out.print(j + " "); //just to give some nice looks
      }
      System.out.println();
    }  
  }
}