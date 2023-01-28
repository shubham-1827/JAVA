/*
arrays are data structrue used to store data in the contigous block of memory.
arrays in java are zero indexed (starting index is 0)
arrays are list of elements of the same type.
*/
import java.util.*;

class Array {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
    //creating array 1st way
    int arr[] = new int[n];
		//or int[] arr = new int[n];

    //another way
    int arr1[] = {10, 20, 30, 40};

		for(int i = 0; i<n; i++) {
      arr[i] = sc.nextInt();
    }

    for(int i = 0; i<n; i++) {
      System.out.print(arr[i] + " ");
    }
		
    //prints address
    System.out.println(arr1);
    
    for(int i = 0; i<4; i++) {
      System.out.print(arr1[i] + " ");
    }

		//unlike c++, in java arrays are already initialized to 0 for int , 0.0 for double
		double arr2[] = new double[n];

    for(int i = 0; i<n; i++) {
      System.out.print(arr2[i] + " ");
    }

		//.length is used to find length of arr
    //implimenting linear search on arr : searching character by character.
    int x = sc.nextInt();

    for(int i = 0; i<arr.length; i++) {
      if (arr[i] == x) {
      	System.out.println(x + " found at index " + i);
        break;
			}
    } 

    //gives max and min value that can be stored in a int variable.
    System.out.println(Integer.MAX_VALUE + " , " + Integer.MIN_VALUE);

  }
}