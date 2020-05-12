package geeksforgeeks.interview.nagarro.Set5;/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/


class MatchGivenNumUniqueChars {
    public static void main(String args[] ) throws Exception {

    	String str = "NagarroisBestSoftwareCompany";
    	printIfNumUniqueIs(16,str);
    	
    	
    }
    
    // Maintain bitvector of booleans, if already set, then continue, else append to a stringbuilder
    private static void printIfNumUniqueIs(int size, String str)
    {
      
    	StringBuilder sb = new StringBuilder();
    	char c = 0;
    	boolean bitVector[] = new boolean[256];
    	
    	for(int i = 0; i<str.length(); i++)
    	{
    		c = str.charAt(i);
    		if(Character.isUpperCase(c))
        	{
        		c = Character.toLowerCase(c);
        	}
    		
    		if(bitVector[c])
    		{
    			continue;
    		}
    		else
    		{
    			bitVector[c] = true;
    			sb.append(c);
    		}
    	}
    	
    	if(size == sb.length())
    	{
    		System.out.println("Yes, it has the mentioned number of unique characters ==> " + sb + " ==> " + size);
    	}
    	else
    	{
    		System.out.println("No, it does not have the mentioned number of unique characters");
    	}
    }
    
}
