import java.util.*;

class Transpose {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int numbers[][] = new int[rows][cols];

    for(int i = 0; i <rows; i++) {
      for(int j = 0; j <cols; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    //trnspose of matrix : interchanging rows and columns.
    //targeting the second digonal half of the matrix, and swapping the values at (i,j) and (j,i)

    for(int i = 0; i<rows; i++) {
      for(int j = i; j<cols; j++) {
        int temp = numbers[i][j];
        numbers[i][j] = numbers[j][i];
        numbers[j][i] = temp;
      }
    }
    for(int i = 0; i<rows; i++) {
      for(int j = 0; j<cols; j++) {
				System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
		}
  }
}