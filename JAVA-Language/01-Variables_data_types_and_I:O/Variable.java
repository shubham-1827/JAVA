//this module is used for the Scanner class to take input
// * will import all the things in this.
import java.util.Scanner;

class Variable {
  public static void main(String[] args) {
    /*
    output in java (3 ways):
    	1. print()
      system.out.print()
      -using this you can print in single line
    	
      2. println() 
      system.out.println()
      -this adds a new line after every print statement

      3. print() with "\n"
  		system.out.print("------/n")
      -\n also gives new line.
      */

      System.out.print("hello");
      System.out.print("world");
			System.out.print("\n");
      System.out.println("Hello");
      System.out.println("world");    

      System.out.println("*");
      System.out.println("**");
      System.out.println("***");
      System.out.println("****");

      //or
      System.out.print("*\n**\n***\n****");

			/*
      variables are expressions that can change. like, a = 10, b = 25, name = shubham
      constant can never change. like, 2, "shubham", 'a', 'd'.

      in Java there are 8 primitive data types:
      	byte, short, int, char, boolean, float, double, long

				(all have different amount of storage associated to them)
        (we cant modify or create these data types according to us)

      non-primitive data types:
      	string, array, class, object, interface

        (we can modify or even create these types of data types.)
      */
			int a = 10;
      int b = 25;
			
      int sum = a + b;
      int parameter = 2*(sum);
			System.out.println(parameter);

      a = 20;
      b = 10;
      sum = a + b;
      parameter = 2*sum;
			System.out.println(parameter);
			
      byte c = 1;
      short d = 32;
			System.out.println(d);
	
      //used to store characters
      char letter = 'a';
			System.out.println(letter);
  		
      //used to store true or false
      boolean isWinning = true;
			System.out.println(isWinning);

			/* input in java
      you need to define a Scanner object in order to take input.
      */
      Scanner sc = new Scanner(System.in);

      //only takes single word as input
      // String name = sc.next();
			// System.out.println(name);

      //takes the whole line as input or we can say it takes input until we hit \n
      String full_name = sc.nextLine();
			System.out.println(full_name);
			
      //other input methods:
      	//nexrInt(), nextFloat() .... etc.

    /* constants variables are variables whose values are fixed throughout the execution of program */
			final float pi = 3.14;
  }
}