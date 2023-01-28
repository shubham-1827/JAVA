import java.util.*;

class TwoDArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int numbers[][] = new int[rows][cols];
		
    //taking input of 2d array.
    for(int i = 0; i<rows; i++) {
      for(int j = 0; j<cols; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }
		//printing 2d array
    for(int i = 0; i<rows; i++) {
      for(int j = 0; j<cols; j++) {
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();    
    }

    //linear search in 2d array.
    int x = sc.nextInt();

    for(int i = 0; i<rows; i++) {
      for(int j = 0; j<cols; j++) {
        if(numbers[i][j] == x) {
          System.out.println(x + " found at (" + i + ", " + j + ")");
        }
      }
    }
		//another way of creating 2d array.
    int num[][] = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };

    for(int i = 0; i<3; i++) {
      for(int j = 0; j<3; j++) {
        System.out.print(num[i][j] + " ");
      }
      System.out.println();    
    }


  }
}