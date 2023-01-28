
import java.util.*;

class CombineLength {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String names[] = new String[n];
		
    int totalLength = 0;
    for(int i = 0; i<n; i++) {
      names[i] = sc.next();
      totalLength += names[i].length();
    }
		System.out.println("The total length is " + totalLength);
    
  }
}