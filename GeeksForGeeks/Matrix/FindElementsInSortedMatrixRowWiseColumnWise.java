package matrix;

/**
 * Created by GSW on 6/25/2017.
 */
/*
http://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
Given an n x n matrix and a number x, find position of x in the matrix if it is present in it. Else print “Not Found”.
In the given matrix, every row and column is sorted in increasing order. The designed algorithm should have linear time complexity.
 */

public class FindElementsInSortedMatrixRowWiseColumnWise {

    public static void main(String args[])
    {

        // matrix - 4x4, with elements as sorted row-wise and column-wise
        //int matrix[][] = new int[4][4];

        int matrix[][] = {{ 10,20,30,40},
                          { 15,25,35,45},
                          { 27,37,47,57},
                          { 29,38,48,58}
                         };

        int x = 38;

        // top-right approach
        System.out.println("no of rows = "+ matrix.length);
        System.out.println("no. of columns = "+ matrix[0].length);
        // top-right approach
        int row = 0; int col = matrix[0].length - 1;
        int numIterations = 0;
        while(true){
            // check if element is equal to x, if yes, return
            // if x is less than element, turn left -- col decrement
           // if x is more than element, turn down -- row increment
            numIterations ++;
            System.out.println("Finding after "+ numIterations + " iterations");
            System.out.println("Searching in row = "+ row + " column = "+ col);
            if(x == matrix[row][col]){
                System.out.println("Found our element");
                System.out.println(" row = "+ row + " col = "+ col);
                break;
            }
            else if( x < matrix[row][col] ){
                int tempCol = col - 1;
                // if column goes below 0, return from code by saying not found
                if(tempCol < 0){
                    System.out.println("Element not found");
                    break;
                }
                else{
                    col--;
                }
            }
            else{
                int tempRow = row + 1;
                // if column goes below 0, return from code by saying not found
                if(tempRow > matrix.length - 1){
                    System.out.println("Element not found");
                    break;
                }
                else{
                    row++;
                }
            }

        }

    }

    // LEARNINGS:
    // matrix.length - no. of rows
    // matrix[anyrow].length - no. of columns
    // edge cases - when row exceeds row count or column exceeds col count - goes out of bounds.
}
