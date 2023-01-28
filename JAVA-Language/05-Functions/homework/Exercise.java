import java.util.*;

class Exercise {
	//finds average
  public static float average(int n1, int n2, int n3) {
    return (n1 + n2 + n3) / 3;
  }
	
  //sum of all odds till n
  public static void sumofOdd(int n) {
    int sum = 0;
    for (int i = 1; i<=n; i++) {
      if (i%2 != 0) 
      	sum += i;
    }
    System.out.println("Sum of odd till " + n + " is " + sum);
  }

	//find greatest
  public static int greatest(int n1, int n2) {
    if (n1 > n2) 
    	return n1;
    else
    	return n2;
  }
	
  //circumference of circle
  public static float circumference(float radius) {
    float pi = 3.14f;
    return 2*pi*radius;
  }
	
  //age check
  public static void isEligibleToVote(int age) {
    if (age > 18) 
			System.out.println("Yes you can vote!");
    else
    	System.out.println("No you cant give vote!");
  }
	
  //power function
  public static void power(int n, int x) { //gives (x)^n
  	long power = 1;
    for (int i = 1; i<=n; i++) {
      power *= x;
    }
    System.out.println(power);
  }

  //GCD : range € [1, a] (assuming a is smaller than b)
  public static int gcd(int a, int b) {
    int gcd = 0;
    for (int i = a; i>=1; i--) {
			if (a%i == 0 && b%i == 0) {
        gcd = i;
        return gcd;
      }
    }
    return gcd; //this will take the case of zero
  }
	
  /*
  In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
  fibonnaci(0) = 0
  fibbonscci(1) = 0
  fibbonnaci(n) = fibbonnaci(n-1) + fibbonnaci(n-2)
  */
  //prints fibbonacci till n
  public static void fibbonnaci(int n) {
		int x = 0;
    int y = 1;
    int z = 0;
    for (int i = 1; i<=n; i++) {
      System.out.print(z + " ");
      x = y;
      y = z;
      z = (x + y);
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
    int n = sc.nextInt();
		int n1 = sc.nextInt();
    int n2 = sc.nextInt();
		
    System.out.println("Average is " + average(n, n1, n2)); 
    sumofOdd(n);
		System.out.println("the greatest is " + greatest(n, n1));
		System.out.println("The circumference of circle with radius " + n2 + " is " + circumference(n2));
    isEligibleToVote(n);
    System.out.print(n1 + " to the power " + n + " is ");
    power(n1, n); //(20)^10
    System.out.println("GCD is " + gcd(n, n1));
    fibbonnaci(n);
  }
}