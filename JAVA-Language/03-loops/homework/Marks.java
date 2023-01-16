
import java.util.*;

class Marks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
    int to_continue = 0;

  	do {
    	int score = sc.nextInt();
      if (score >= 90) 
      	System.out.println("This is Good!!");
      else if (score >= 60)
      	System.out.println("This is also Good!!");
     	else 
      	System.out.println("This is Good as well!!");
			
      System.out.println("Do you want to check another score? (1 for yes and 0 for no) : ");
      to_continue = sc.nextInt();
  	}
    while (to_continue == 1);
  }
}