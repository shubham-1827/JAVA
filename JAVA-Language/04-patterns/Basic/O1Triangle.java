/*
for n = 4
pattern: 
1
01
101
0101

observations:
1. no. of rows = n
2. no. of numbers in ith row = i
3. if sum of i and j (i+j) is even then, then in that cell 1 will appear.
4. else 0 will appear.
*/
import java.util.*;

class O1Triangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
		
    int temp_val = 1;

    for (int i = 1; i<=n; i++) {
      for(int j = 1; j<=i; j++) {
        if ((i+j)%2==0) 
          temp_val = 1;
        else 
          temp_val = 0;
        System.out.print(temp_val);
      }
      System.out.println();
    }
  }
}