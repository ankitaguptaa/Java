import java.util.*;
import java.util.stream.Collectors;

public class Anagram {

    public static void main(String[] args) {
        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
        anagram(input);
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    }
    //sort aet, aet,
    //actual eat, tea
    public static void anagram(String[] input){
        Map<String, List<String>> anagram= new HashMap<>();//aet,2
        for (String s: input){//eat"eat","tea","tan","ate","nat","bat"
            char[] unsortedArr = s.toCharArray();//e,a,t
            Arrays.sort(unsortedArr);//a,e,t
            String sortedString = new String(unsortedArr); //aet
            if(anagram.containsKey(sortedString)) {//not found
                anagram.get(sortedString).add(s);
            }else{
                List<String> listOfUnsortedStr = new ArrayList<>();
                listOfUnsortedStr.add(s);
                anagram.put(sortedString,listOfUnsortedStr); // aet. eat
            }

        }
        System.out.println(anagram.values().stream().collect(Collectors.toList()));
    }
}
