package geeksforgeeks.interview.nagarro.Set5;/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/


public class IncreasingSubSeq {
    public static void main(String args[] ) throws Exception {

    	int arr[] = {1 , 2 , 3 , 4 , 5 , 3 , 4 , 5 , 6 , 7 , 109 , 110 , 111 , 12 , 8 , 9 , 10 , 21 , 35 , 36 , 37 , 22};
    	findIncSubSeq(arr);
    	
    	
    }
    
    private static void findIncSubSeq(int[] arr) {
    	
    	int oldStart = 0, oldSum = 0, sum = 0, start = 0;
    	start = arr[0];
    	sum += start;
    	
    	for(int i = 1; i < arr.length; i++)
    	{
    		if(arr[i-1] ==  arr[i] -1)
    		{
    			sum += arr[i];
    		}
    		else
    		{
    			if(sum > oldSum)
    			{
    				oldStart = start;
    				oldSum = sum;    				
    			}
    			sum = 0;
				start = arr[i];
				sum += start;

    		}
    	}
    	
    	if(sum > oldSum)
    	{
    		System.out.println("New Sum is "+ sum);
    		for(int k = start; ; k++)
    		{
    			System.out.print(k + " ");
    			sum -= k;
    			if(sum == 0)
    			{
    				break;
    			}
    		}
    	}
    	else
    	{
    		System.out.println("Old Sum is "+ oldSum);
    		for(int k = oldStart; ; k++)
    		{
    			System.out.print(k + " ");
    			oldSum -= k;
    			if(oldSum == 0)
    			{
    				break;
    			}
    			
    		}
    	}
    	
    }

	    
}
