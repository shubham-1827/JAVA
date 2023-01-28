
import java.util.*;

class Username {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StringBuilder email = new StringBuilder("");

    email.append(sc.next());
		
    int i = 0;
    while (email.charAt(i) != '@') {
      i++;
    }

    email.delete(i, email.length());
    System.out.println(email);
  }
}