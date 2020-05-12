package leetcode;

import java.util.Arrays;
import java.util.List;

class Solution {
    public static String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        List vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');

        for(int i=0,j=arr.length -1 ;i<j;){
            while(!isVowel(arr[i]) && i<j){
                i++;
            }
            while(!isVowel(arr[j]) && i<j){
                j--;
            }
            if(arr[i] != arr[j]){
                swap(arr[i],arr[j]);

                i++;
                j--;
            }
            else{
                i++;
                j--;
            }

        }

        return String.valueOf(arr);

    }

    public static void main(String[] args) {
        String s = "aA";
        System.out.println(reverseVowels(s));

    }

    public static boolean isVowel(char ch){
        if(ch == 'a' ||
           ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u' ||
                ch == 'A' ||
                ch == 'E' ||
                ch == 'I' ||
                ch == 'O' ||
                ch == 'U'){
            return true;
        }
        else{
            return false;
        }
    }

    private static void swap(char s, char t){
        char temp = t;
        t = s;
        s = temp;
    }


}