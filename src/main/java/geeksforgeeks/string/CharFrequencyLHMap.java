package geeksforgeeks.string;

import java.util.LinkedHashMap;

/**
 * https://www.geeksforgeeks.org/print-characters-and-their-frequencies-in-order-of-occurrence-using-a-linkedhashmap-in-java/
 *
 * Print characters and their frequencies in order of occurrence using a LinkedHashMap in Java
 *
 * Complexity: easy
 *
 * Logic is to use a linkedHashMap so that order of input characters are preserved.
 * And count of characters need to be incremented, whenever it appears again.
 */
public class CharFrequencyLHMap {

    public static void main(String[] args) {
        String str = "Integration Platform as a service";
        int n = str.length();
        printCharFrequency(str,n);
    }

    private static void printCharFrequency(String str, int n) {

        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();

        for(int i =0; i< n; i++){

            Character c= str.charAt(i);
            if(lhm.get(c) == null){
                lhm.put(c,1);
            }
            else{
                Integer currentCount = lhm.get(c);
                currentCount++;
                lhm.put(c,currentCount);
            }
        }

        for(Character c: lhm.keySet()){
            System.out.print(" " +c + lhm.get(c) + " ");
        }

    }
}
