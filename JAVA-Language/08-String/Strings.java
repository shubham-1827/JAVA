import java.util.*;

class Strings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

  	String name = "shubham";
    String sentence = "Shubham is a fucking womeniser.";

    //used to take only a single word as input
    String name1 = sc.next();
    //this can takes the whole sentence with spaces.
    String name2 = sc.nextLine();
		
    //concatenate strings = using the + operator.
    String firstName = "Shubham";
    String lastName = "Tiwari";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
  
    //compare string : compares strings on the basis of alphabetical order
    //compareto returns +ve for first greater, 0 for equal, -ve for second greater.
    if(firstName.compareTo(lastName) <0 || firstName.compareTo(lastName) > 0) {
			System.out.println("Strings are not equal");
    }
		else {
      System.out.println("Strings are equal");
    }

    //another way of creating strings.
    String name3 = new String("Anjali");

    //you can also use == for comparision, but it will fail in many cases like, 
    if(new String("tony") == new String("tony")) {
      System.out.println("Strings are equal");
    }
    else {
      System.out.println("Strings are not equal"); // this will be printed, which is wrong
    }
		
    //getting a single character from a string
    System.out.println(fullName.charAt(5));

    //substring : a part from a bigger string
    //ending index is not included
  	System.out.println(fullName.substring(5, 8));
		
    //converting from string to integer type.
    String num = "12345";
    int num1 = Integer.parseInt(num);
    System.out.println(num1);

    //converting from number to string
    String num2 = Integer.toString(num1);
		
    /*
    Strings are immutable, means once a string is created on the heap you cant chage that string, and when 
    change occurs a new string is created again on different memory location after every change and the 
    previous one is discarded.
    this, takes some amount of time , so to avoid this StringBuilder class is used, which is capble of 
    changing the string in the same memory location without creating a new one.
*/
  }
}