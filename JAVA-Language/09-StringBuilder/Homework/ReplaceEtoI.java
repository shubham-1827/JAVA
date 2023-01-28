
import java.util.*;

class ReplaceEtoI {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

		StringBuilder name = new StringBuilder("");

    name.append(sc.next());

    for(int i = 0; i<name.length(); i++) {
      if(name.charAt(i) == 'e') {
        name.setCharAt(i,'i');
      }
    }
		System.out.println(name);
  }
}