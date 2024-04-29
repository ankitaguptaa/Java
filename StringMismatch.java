import org.junit.Assert;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMismatch {
    public static void main(String[] args) {
        String str1 = "Firstly this is the first string";
        String str2 = "Next is the second string";
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
//        List l= Arrays.stream(arr1).filter(item -> !str2.contains(item)).collect(Collectors.toList());
//        List m= Arrays.stream(arr2).filter(item -> !str1.contains(item)).collect(Collectors.toList());
//        System.out.print(l);
//        System.out.println(m);


        String[] expected_1 = {"Firstly", "this", "first", "Next", "second"};
        String[] output_1 = returnMismatchedWordsNittin(str1, str2);



        // Test Case 2
        String str3 = "This is the first string extra";
        String str4 = "This is the second string";
        String[] expected_2 = {"first", "extra", "second"};
        String[] output_2 = returnMismatchedWordsNittin(str3, str4);



        // Test Case 3
        String str5 = "This is the first text";
        String str6 = "This is the second string";
        String[] expected_3 = {"first", "second", "text", "string"};
        String[] output_3 = returnMismatchedWordsNittin(str5, str6);

    }

    static String[] returnMismatchedWordsNittin(String str1, String str2) {
        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        for(String eachWord : arr1) {
            if(!str2.contains(eachWord)){
                list.add(eachWord);
            }
        }
        for(String eachWord : arr2) {
            if(!str1.contains(eachWord)){
                list.add(eachWord);
            }
        }
       // String[] stringArray = stringList.toArray(new String[0]);

        String[] resultArr = list.toArray(new String[list.size()]);
       // System.out.println(list);
        for (String eachStr : resultArr){
            System.out.println(eachStr);
        }
        return resultArr;
    }

    static String[] returnMismatchedWords(String str1, String str2) {

        String[] arr1 = str1.split(" ");
        String[] arr2 = str2.split(" ");
        ArrayList<String> newList = new ArrayList<String>();
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        Map<String, Integer> map3 = new HashMap<String, Integer>(map1);
        for (String eachWord : arr1) {
            if (map1.containsKey(eachWord)) {
                map1.put(eachWord, map1.get(eachWord) + 1);
            } else {
                map1.put(eachWord, 1);
            }
        }
        for (String eachWord : arr2) {
            if (map2.containsKey(eachWord)) {
                map2.put(eachWord, map2.get(eachWord) + 1);
            } else {
                map2.put(eachWord, 1);
            }
        }
        for (String eachWord : arr2) {
            if (map1.containsKey(eachWord)) {
                map1.remove(eachWord);
            }
        }
        for (String eachWord : arr1) {
            if (map2.containsKey(eachWord)) {
                map2.remove(eachWord);
            }
        }

        map3.putAll(map1);
        map3.putAll(map2);
        String[] arr  = map3.keySet().toArray(new String[0]);

        Set<String> allKeys = map3.keySet();

            ArrayList<String> listOfKeys
                    = new ArrayList<String>(allKeys);
            String resultArr[] = listOfKeys.toArray(new String[listOfKeys.size()]);
            System.out.println(allKeys);
        // Write your code here

        return resultArr;

        }



}


