
import java.util.*;

class stringBuild {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
    StringBuilder name = new StringBuilder("shubham");

    System.out.println(name);

    //access a character
    System.out.println(name.charAt(3));

    //set the character
    name.setCharAt(4, 't');
    System.out.println(name);

    //insert a character at index
    name.insert(5, 'x');
    System.out.println(name);

    //delete a substring
    //end index not included
    name.delete(3, 6);
    System.out.println(name);

    //append a character or a new string at the end
    name.append("m");
    name.append(" tiwari");
    System.out.println(name);

    //finds the length
    System.out.println(name.length());

	}
}