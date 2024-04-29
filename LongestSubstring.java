package oops;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        char[] arr = s.toCharArray();
        StringBuilder secondLongestString =new StringBuilder();
        int counter = 0;
        StringBuilder longestString = new StringBuilder();
        Map<Character, Integer> characterCount  = new HashMap<>();
        for (int i = 0; i <arr.length; ){

            if(characterCount.containsKey(arr[i])) { //b

                if (longestString.length() < secondLongestString.length()) {
                    longestString = secondLongestString;
                    secondLongestString  = new StringBuilder();
                }
                i= characterCount.get(arr[i])+1;


            }else{
                characterCount.put(arr[i],i);
                secondLongestString.append(arr[i]); //abc
                i++;
            }
        }
        return secondLongestString.length();
    }

    public static void main(String[] args) {
      new LongestSubstring().lengthOfLongestSubstring("abcbedfa");
    }
}
