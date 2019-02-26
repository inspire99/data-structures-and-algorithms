/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/


public class ThiefJumpingWalls {
    public static void main(String args[] ) throws Exception {

    	int heightArr[] = {100 , 120 , 90 , 54 , 90 , 73 , 64 , 125 , 96 , 77 };
    	int climbX = 5;
    	int slipDown = 3;
    	findTotalJumps(heightArr,climbX,slipDown);
    	
    	
    }
    
    private static void findTotalJumps(int[] heightArr, int climbX, int slipDown) {
    	int jumps = 0;
    	
    	for( int i = 0; i< heightArr.length; i++)
    	{
    		int currentHeight = 0;
    		
    		while(true)
    		{
    			currentHeight += climbX;
    			currentHeight -= slipDown;
    			
    			jumps++;
    			
    			if(currentHeight >= heightArr[i])
    			{
    				break;
    			}
    			
    			if((currentHeight + climbX) >= heightArr[i])
    			{
    				jumps++;
    				break;
    			}
    		}
    	}
    	
    	System.out.println(jumps);
	}
	    
}
