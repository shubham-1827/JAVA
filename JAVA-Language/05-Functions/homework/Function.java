import java.util.*;
class Function {
  /* function to check prime number. */
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		
    for (int i = 2; i<=(num/2); i++) {
      if (num % i == 0) {
				isPrime = false;
        return isPrime;
    	}
    }
    return isPrime;
  }

  public static void evenOrOdd(int n) {
      if (n%2 == 0) 
      	System.out.println(n + " is even");
      else 
      	System.out.println(n + " is Odd");    	    
  }
	
  public static void table(int n) {
		for (int i = 1; i<=10; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
    }
  }

  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(isPrime(n));
    evenOrOdd(n);
    table(n);
  }
}