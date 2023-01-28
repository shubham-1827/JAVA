
import java.util.*;

class Reverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
    StringBuilder name = new StringBuilder("");
    name.append(sc.nextLine());

    for(int i = 0; i<(name.length()) / 2; i++) {
      int endIndex = name.length() - 1 - i;
      char startLetter = name.charAt(i);
      char endLetter = name.charAt(endIndex);

      name.setCharAt(i, endLetter);
      name.setCharAt(endIndex, startLetter);
    }
    System.out.println(name);
  }
}
