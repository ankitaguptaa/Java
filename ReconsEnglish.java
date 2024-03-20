import java.util.LinkedHashMap;
import java.util.Map;

public class ReconsEnglish {
    public static void main(String[] args) {
    String input  = "owoztneoer";
      ReconsEnglish obj = new ReconsEnglish();
      obj.recons(input);
    }
    public String recons(String input) {
        StringBuilder output = new StringBuilder();
        Map<String, String> mapOfDigits = new LinkedHashMap<>();
        mapOfDigits.put("zero", "0");
        mapOfDigits.put("one", "1");
        mapOfDigits.put("two", "2");
        mapOfDigits.put("three", "3");
        mapOfDigits.put("four", "4");
        mapOfDigits.put("five", "5");
        mapOfDigits.put("six", "6");
        mapOfDigits.put("seven", "7");
        mapOfDigits.put("eight", "8");
        mapOfDigits.put("nine", "9");
        //owozer

        char[] inputArr = input.toCharArray();//o,w,o,z,e,r
        boolean isFound = false; int count = 0;
        for (Map.Entry<String, String> entry : mapOfDigits.entrySet()){ // zero
                for(char ch: entry.getKey().toCharArray()){ //z
                    for(int i = 0; i<inputArr.length;i++){
                    if (ch == inputArr[i]){ // e =o
                        isFound = true;
                        count++;
                        break;
                    } else{
                        isFound = false;
                    }
                }

                }
            if(isFound && entry.getKey().length() == count){
                output.append(entry.getValue());
                System.out.print(entry.getValue());
            }
            count=0;
            isFound=false;

        }

       return output.toString();
    }
}
