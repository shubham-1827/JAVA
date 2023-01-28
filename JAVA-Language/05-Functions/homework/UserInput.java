import java.util.*;

class UserInput {
  //take user inputs until 0
  public static void userInput (int n) {
    Scanner sc =  new Scanner(System.in);

    int i = 1;
    int num = 0;
    int positive = 0;
    int negative = 0;
    int zeroes = 0;

    do {
      num = sc.nextInt();     
      if (num > 0) 
				positive++;    
      else if (num < 0)
        negative++; 
      else 
      	zeroes++;  
      i++;    
    }
    while (i <= n);

    System.out.println(positive + " " + negative + " " + zeroes);
  }
  
  public static void main(String[] args) {
		userInput(8);
  }
}