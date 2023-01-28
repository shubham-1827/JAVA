/*
like other languages java also has functions which helps use to modularize our code.

functions are used when you want to use ceratain statements in deferrent regions of your program so you 
can group them in a function and that function wherever you want them.

functions in java are created on stack when they are called.

(a stack record is a part of stack of memory where all function variables are stored.)

like, if you call a function in main then a new stack record is inserted or created on stack for that 
function over the stack record of main
and when the function call is over then the function stack record is removed.

syntax:
returnType functionName (type parameter1, type parameter2 .....) {
  statements ....
  return value;
}

Diffrence between function and method:
both functions and methods have the same syntax.
functions are called independently and methods are called by the objects.

*/
import java.util.*;

class Functions {

  public static int addNum(int a, int b) {
		return a + b;
  }
	
  public static void printFactorial (int num) {
		int factorial = 1;
    
    for (int i = 1; i<=num; i++) {
      factorial*=i;
    }
     System.out.println(factorial);
  }

  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

		int sum = addNum(a, b);
    System.out.println("The sum is " + sum);
		
    int num = sc.nextInt();
  	printFactorial(num);
		
  }
}



