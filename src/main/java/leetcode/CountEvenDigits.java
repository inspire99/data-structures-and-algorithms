package leetcode;

/**
 * 1. Here a simple solution is used: 
 * Integer.toString() to  find number of digits and 
 * then checking if that number is divisible by 2.
 * 
 * 2. Another alternative is to create a loop, this loop will determine number of digits,
 * by dividing by 10
 * 
 * Output after running the code::
 * 2
Time after calling getNumEvenDigits is 331100
2
Time after calling costly method is 242300
Conclusion: Integer.toString() is not less costly as it seems.
Need to check for very long numbers..
 */
public class CountEvenDigits{

    public static void main(String[] args) {

        int input_array[] = { 12, 234, 444, 5555, 98939};

        long start =0, end =0;

        start = System.nanoTime();        
        System.out.println(getNumEvenDigits(input_array));
        end = System.nanoTime();
        System.out.println("Time after calling getNumEvenDigits is "+ (end-start));

        start = System.nanoTime();        
        System.out.println(costlyGetNumEvenDigits(input_array));
        end = System.nanoTime();
        System.out.println("Time after calling costly method is "+ (end-start));

    }

    public static int getNumEvenDigits(int input_array[]){

        // iterate over array
        // maintain a count variable to hold count of numbers having even digits

        int countEven = 0;

        for(int i = 0; i< input_array.length; i++){
            int numDigits = Integer.toString(input_array[i]).length();
            if(numDigits %2 == 0){
                countEven++;
            }
        }

        return countEven;

    }

    public static int costlyGetNumEvenDigits(int input_array[]){
        int num = 0;
        int countEven = 0;
        int countEach = 0;
        for(int i = 0; i< input_array.length; i++){

            num = input_array[i];
            while(num > 0){
                countEach++;
                num  = num / 10;
            }

            if(countEach % 2 == 0 ){
                countEven++;
            }

            countEach = 0;
        }

        return countEven;
    

    }

}