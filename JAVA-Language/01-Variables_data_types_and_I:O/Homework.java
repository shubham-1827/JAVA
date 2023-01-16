import java.util.*;

class Homework {
  public static void main(String[] args) {

    //homework 1
    Scanner sc = new Scanner(System.in);
		
    float age = sc.nextFloat();
    System.out.println(age);

		//homework 2
    float radius = sc.nextFloat();
		
    final double pi = 3.14;
    double area = pi * radius * radius;
    System.out.println(area);
   
   	//homework 3
    int n = sc.nextInt();
    
    //later we will use loops for this.
    System.out.println(n * 1);
    System.out.println(n * 2);
    System.out.println(n * 3);
    System.out.println(n * 4);
    System.out.println(n * 5);
    System.out.println(n * 6);
    System.out.println(n * 7);
    System.out.println(n * 8);
    System.out.println(n * 9);
    System.out.println(n * 10); 
  }
}