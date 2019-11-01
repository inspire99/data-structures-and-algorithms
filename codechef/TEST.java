/* package codechef; // don't place package name! */

/**
 * This is the solution for the problem: https://www.codechef.com/problems/TEST 
 * 
 * My solution is submitted in https://www.codechef.com/viewsolution/27658767
 */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()){// if we do not perform this check, we get NZEC, so this check is essential for boundary testing
            int input = scanner.nextInt();
            if(input == 42){
                break;
            }
            else{
                System.out.println(input);
            }
        }

        
		
	}
}