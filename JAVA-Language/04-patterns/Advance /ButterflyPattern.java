/*
for n = 4
pattern:
*			 *   
**		**
***	 ***
********
********
***  ***
**    **
*			 *

observations:
1. no. of rows = 2n
2. no. of columns = 2n
3. print stars only for j<=i(for front stars) and j>(2*n - i)(for backward stars)
*/

import java.util.*;

class ButterflyPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
		
    //upper part
    for (int i = 1; i<=n; i++) {
      for(int j = 1; j<=2*n; j++) {

        if (j <= i || j > (2*n - i))
					System.out.print("*");

        else 
          System.out.print(" ");
        
      }
      System.out.println();
    }
		
    //lower part
    for (int i = n; i>0; i--) {
      for(int j = 1; j<=2*n; j++) {

        if (j <= i || j > (2*n - i))
					System.out.print("*");

        else 
          System.out.print(" ");
        
      }
      System.out.println();
    }

    System.out.println();
    
    /*
    Another way (using the same n)

    obsevations:
    1. no. of spaces in ith row = 2(n - i)
    2. in start of ith row no. of stars = i
    3. in end of ith row no. of stars = i
	*/
    //upper part
    for (int i = 1; i<=n; i++) {

      //starting stars
      for(int j = 1; j<=i; j++) {
        System.out.print("*");
      }

      //for spaces 
      for(int j = 1; j<=2*(n-i); j++) {
        System.out.print(" ");
      }

      //for backward stars
      for(int j = 1; j<=i; j++) {
				System.out.print("*");
      }

      System.out.println();
    }	
	
    //lower part
    for (int i = n; i>=1; i--) {

      //starting stars
      for(int j = 1; j<=i; j++) {
        System.out.print("*");
      }

      //for spaces 
      for(int j = 1; j<=2*(n-i); j++) {
        System.out.print(" ");
      }

      //for backward stars
      for(int j = 1; j<=i; j++) {
				System.out.print("*");
      }

      System.out.println();
    }	

  }
}