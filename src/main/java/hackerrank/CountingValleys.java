package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 *
 * It must return an integer that denotes the number of valleys Gary traversed.
 */
public class CountingValleys {

    // Complete the countingValleys function below.

    /**
     * INPUT
     * 8
     * UDDDUDUU
     *
     * OUTPUT
     * 1
     *
     * INPUT
     *
     * 12
     * DDUUDDUDUUUD
     *
     * OUTPUT
     *
     * 2
     * @param n
     * @param s
     * @return
     */
    static int countingValleys(int n, String s) {

        // we can initialize with sea level , with value = 0;
        // when we go below 0, we have reached a valley.
        // once we cross negative, go to positive and then negative, we have reached another valley

        int level = 0;
        int valleyCount = 0;
        boolean prevValueNegative = false;
        char first = s.charAt(0);
        if(first == 'U'){
            level++;
        }
        else{
            level--;
        }

        if(level < 0){
            prevValueNegative = true;
        }

        


        for(int i=1; i< n; i++){

            if(level < 0){
                prevValueNegative = true;
            }
            else{
                prevValueNegative = false;
            }
            // if char is U, means, it is up
            // if char is D, means, it is down
            char inp = s.charAt(i);
            if(inp == 'U'){
                level++;
            }
            else
            {
                level--;
            }



            if(level == 0 && prevValueNegative){
                valleyCount++;
            }

            

        }

        return valleyCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
*/
        scanner.close();
    }
}
