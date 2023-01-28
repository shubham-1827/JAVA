import java.util.*;

class CheckSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int numbers[] = new int[n];

    for (int i =0; i<n; i++) {
      numbers[i] = sc.nextInt();
    }

    boolean ifSorted = true;
    for(int i = 1; i<n; i++) {
      if (numbers[i] < numbers[i-1]) {
        ifSorted = false;
        break;
      }
    }

    if(ifSorted) 
    	System.out.println("Array is sorted in ascending order.");
    else 
    	System.out.println("Array is not sorted."); 	
  }
}