
import java.util.*;

class CombineLength {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    StringBuilder names[] = new StringBuilder[n];

    for(int i = 0; i<n; i++) {
      names[i] = new StringBuilder(sc.next());
    }
		
    int totalLength = 0;
    for(int i = 0; i<n; i++) {
      totalLength += names[i].length();
    }
    System.out.println(totalLength);
  }
}