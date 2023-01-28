import java.util.*;

class ReplaceEtoI {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String para = sc.nextLine();
		
    String newString = "";
    for(int i = 0; i<para.length(); i++) {
      if(para.charAt(i) == 'e') {
				newString += "i";
        continue;
      }
      newString += para.charAt(i);
    }
    System.out.println(newString);
  }
}
