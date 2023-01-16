import java.util.*;

class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float a = sc.nextFloat();
    float b = sc.nextFloat();
    char operation = sc.next().charAt(0);

    switch(operation) {
      case '+':
      	System.out.println(a + b);
				break;     
      case '-':
      	System.out.println(a - b);
        break;     
      case '*':
      	System.out.println(a * b);
				break;
      case '/':
      	if (b == 0)
        	System.out.println("Invalid Division!!");
        else 
      		System.out.println(a / b);
				break;
      case '%':
      	if (b == 0)
        	System.out.println("Invalid Division!!");
				else 
      		System.out.println(a % b);
				break;
      default: System.out.println("Invalid Operation!!");   	
    }
  }
}