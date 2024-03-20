import java.util.ArrayList;
import java.util.List;

public class JPCodeQuestion {

    public static void main(String[] args) {
        String input = "12359a6784@-5-7-3-2-1";
        findContinuousSequence(input);
    }
    //find continuous sequence of numbers
    //input 12359a6784@-5-7-3-2-1

    public static List<List<Integer>> findContinuousSequence(String input) {
        char[] inputArr = input.toCharArray();
        StringBuilder output = new StringBuilder();
        boolean isSequence = false;
        List<Integer> sequence = new ArrayList<>();
        List<List<Integer>> listOfSequence = new ArrayList<>();

        for(int i = 0; i<inputArr.length-1;i++){
            if(inputArr[i + 1] == (inputArr[i] + 1)){
                sequence.add(Character.getNumericValue(inputArr[i]));
                isSequence = true;
            }else {
                if(isSequence){
                    sequence.add(Character.getNumericValue(inputArr[i]));
                    isSequence=false;
                    listOfSequence.add(sequence);
                    sequence = new ArrayList<>();
                }
            }


        }

        System.out.println(listOfSequence);
        return listOfSequence;
    }

}
