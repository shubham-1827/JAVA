import java.util.*;

class IfElseSwitch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /* if a particular condition is true then if statement executes.
    	otherwise else statement will execute.

      to check multiple conditions in the same control flow you can use else if statments.
      
      and, to create different control flows you can use multiple if statements at the same scope level.
    */
    int age = sc.nextInt();
    
    if (age >= 18) {
      System.out.println("Adult");
    }
    else {
      System.out.println("Not Adult");
    }
		
    //comparing numbers
		int a = sc.nextInt();
    int b = sc.nextInt();

    if (a == b) {
      System.out.println("a is equal to b");   
    }
    else if (a > b) {
      System.out.println("a is greater than b");   
    }
    else {
      System.out.println("a is lesser than b");  
    }
		
    /*checking even or odd:
    	even if n % 2 == 0 
      else odd
      (% = modulo operator gives remainder of a division.)*/

    int num = sc.nextInt();

		//for single statements inside if or else you can remove the curly braces.
    if (num % 2 == 0) 
      System.out.println("Even");
    
    else 
      System.out.println("Odd");     
    
    /*
    switch statement: it is used when you want to comapare a single variable with mutiple options.
    */
    
    String day = sc.nextLine(); // not getting read for now!!

    switch(day) {
      case "monday":
      	System.out.println("Go to Meeting!");
        break;
      
      case "tuesday":
      	System.out.println("Do you homework");
        break;
      
      case "wednesday":
      case "thursday":
      	System.out.println("Do coding challenges!!");
      	break;

      case "friday":
      	System.out.println("Revise every concept");
				break;
      
      case "Saturday":
      	System.out.println("Go to party with friends");
        break;
      
      case "sunday":
      	System.out.println("Enjoy the weekend");
        break;
      
      default: System.out.println("Invalid Day input!!");
    }
  }
}