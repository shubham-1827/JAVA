import java.util.*;

class SpiralPrint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int numbers[][] = new int[rows][cols];

    for(int i = 0; i<rows; i++) {
      for(int j = 0; j<cols; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    //spiral print
    int startRow = 0;
    int endRow = rows - 1;
    int startCol = 0;
    int endCol = cols - 1;
		
    while (startRow <= endRow && startCol <= endCol) {
			
      for(int i = startCol; i<=endCol; i++) {
        System.out.print(numbers[startRow][i] + " ");
      }
      startRow++;
        for(int i = startRow; i<=endRow; i++) {
          System.out.print(numbers[i][endCol] + " ");
        }
        endCol--;
          for(int i = endCol; i>=startCol; i--) {
            System.out.print(numbers[endRow][i] + " ");
          }
          endRow--;
          for(int i = endRow; i>=startRow; i--) {
            System.out.print(numbers[i][startCol] + " ");
          }
          startCol++;
        }   
    	
    
  }
}