import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	 public static void valid_board(int [][] grid){
		  // Checking the rows and columns.
		  for (int i =0 ; i< 9; i++) {
		    int res1 = valid_row(i, grid);
		    int res2 = valid_col(i, grid);
		    // if a row or column is invalid, then the board is invalid.
		    if (res1 < 1 || res2 < 1) {
		        System.out.println( "The board is invalid." );
		        return;
		    }
		  }
		  int res3 = valid_subsquares(grid);
		  // if any one the subsquares is invalid, then the board is invalid.
		  if (res3 < 1) {
		    System.out.println( "The board is invalid." );
		  }
		  else {
		    System.out.println( "The board is valid." );
		  }
		  }
	
	  public static int valid_subsquares(int [][] grid){
		  for (int row = 0 ; row < 9; row = row + 3) {
		    for (int col = 0; col < 9; col = col + 3) {
		      Set<Integer>set = new HashSet<Integer>(); 
		      for(int r = row; r < row+3; r++) {
		        for(int c= col; c < col+3; c++){
		        // Checking for values outside 0 and 9; 
		        // 0 is considered valid because it 
		        // denotes an empty cell.
		        // Removing zeros and the checking for values and
		        // outside 1 and 9 is another way of doing 
		        // the same thing.
		          if (grid[r][c] < 0 || grid[r][c] > 9){
		            System.out.println( "Invalid value" );
		            return -1;
		            }
		            // Checking for repeated values.
		          else if (grid[r][c] != 0){
		            if (set.add(grid[r][c]) == false) {
		            return 0;
		            }
		          }
		        }
		      }
		    }   
		  }
		  return 1;
		  }
	 public static int valid_row(int row, int [][] grid){
		    int temp[] = grid[row];
		    Set<Integer>set = new HashSet<Integer>(); 
		    for (int value : temp) {
		      // Checking for values outside 0 and 9; 
		      // 0 is considered valid because it 
		      // denotes an empty cell.
		      // Removing zeros and the checking for values and
		      // outside 1 and 9 is another way of doing 
		      // the same thing.
		      if (value < 0 || value > 9){
		        System.out.println( "Invalid value" );
		        return -1;
		      }
		      //Checking for repeated values.
		      else if (value != 0){
		        if (set.add(value) == false) {
		        return 0;
		        }
		      }
		    }	
		    return 1;
		  }
	 
	 public static int valid_col(int col, int [][] grid){
		  Set<Integer>set = new HashSet<Integer>(); 
		  for (int i =0 ; i< 9; i++) {
		    // Checking for values outside 0 and 9; 
		    // 0 is considered valid because it 
		    // denotes an empty cell.
		    // Removing zeros and the checking for values and
		    // outside 1 and 9 is another way of doing 
		    // the same thing.
		    if (grid[i][col] < 0 || grid[i][col] > 9){
		      System.out.println( "Invalid value" );
		      return -1;
		    }
		    // Checking for repeated values.
		    else if (grid[i][col] != 0){
		      if (set.add(grid[i][col]) == false) {
		      return 0;
		      }
		    }
		  }
		  return 1;
		  }

}
