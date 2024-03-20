import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JPCodeQuestionTest {

    @Test
    void testFindContinuousSequence() {
        String input = "12359a6784@-5-7-3-2-1";
        List<Integer> suboutput1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> suboutput2 = new ArrayList<>(Arrays.asList(6,7,8));

        List<List<Integer>> expectedOutput= new ArrayList<>(List.of(suboutput1,suboutput2));
        List<List<Integer>> actualOutput = JPCodeQuestion.findContinuousSequence(input);
        System.out.println(expectedOutput);
        System.out.println(actualOutput);
        Assert.assertEquals(expectedOutput, actualOutput);


    }


}