import java.util.*;

class Loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
    /*loops in java are used to repeat a block of code multiple times.
    	3 tyles of loops in java:
      	1. for loop: 

        	for(initialization; condition; updation) {
            statements ....
          }
        
        2. while loop:x

        	initialization;
          while(condition) {
            statements ....
            updation;
          }
				
        3. do while loop:
        	(this loop will execute atleast once even if condition is true or false.)
					
          initialize;
          do {
						statements....
            updation;
          }
          while(condition);
          */
    for(int i = 0; i<3; i++) {
			System.out.println("Hello World"); //prints 3 times
    }

    for(int i = 0; i < 6; i++) {
      System.out.println(i);
    }
		
    int i = 0;

    //prints till 5
    while (i < 6) {
      System.out.println(i);    
      i++; 
    }
		
    //prints till 6
    i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i < 6);
		
    //sum of n natural number.
    int n = sc.nextInt();
    int sum = 0;
    for(i = 1; i <= n; i++) {
			sum += i;
    }
    System.out.println(sum);

    //table till 10 (taking the same n from above)
		for (i = 1; i <= 10; i++) {
      System.out.println(n * i);
    }
  }
}