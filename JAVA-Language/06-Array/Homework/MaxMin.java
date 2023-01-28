import java.util.*;

class MaxMin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int numbers[] = new int[n];

    for(int i = 0; i<n; i++) {
      numbers[i] = sc.nextInt();
    }
    
    int min = numbers[0];
    int max = numbers[0];

    for (int i = 0; i<n; i++) {
      if (numbers[i] > max) 
        max = numbers[i];
      
      else if (numbers[i] < min) 
        min = numbers[i];   
    }
    System.out.println(max + " , " + min);

  }
}