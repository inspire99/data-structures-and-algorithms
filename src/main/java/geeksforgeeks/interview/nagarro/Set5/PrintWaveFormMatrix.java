package geeksforgeeks.interview.nagarro.Set5;/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/


class PrintWaveFormMatrix {
    public static void main(String args[] ) throws Exception {

    	//int [][] A = new int [4][5]; 
    	int [][] A = {
    					{0,1,2,3,4},
    					{5,6,7,8,9},
    					{10,11,12,13,14},
    					{15,16,17,18,19}   			
    				 };
    	
    	printWaveForm(A);
    	
    	
    }
    
    private static void printWaveForm(int[][] a) {
		int numRows = a.length;
		int numCols = a[0].length;
		boolean downwards = true;
		
		System.out.println("Number of rows " +numRows);
		System.out.println("Number of columns "+numCols);
		
		for(int column = 0; column < numCols; column++)
		{
			if(downwards)
			{
				for(int i = 0; i< numRows; i++)
				{
					System.out.print(a[i][column] +"  ");
				}
				downwards = false;
			}
			else
			{
				for(int i = numRows - 1; i >= 0; i--)
				{
					System.out.print(a[i][column] +"  ");
				}				
				downwards = true;
			}
		}
	}
	    
}
