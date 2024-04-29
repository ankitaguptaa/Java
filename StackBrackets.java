import java.util.Scanner;
import java.util.Stack;

public class StackBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        boolean isBalanced= false;
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            char[] ch = input.toCharArray();
            for(Character eachChar : ch){

                if(eachChar == '(' || eachChar =='{' || eachChar == '['){
                    st.push(eachChar);
                    isBalanced = false;


                }

                if(eachChar == ')') {
                    char check = st.pop();
                    if(check == '(') {
                        isBalanced = true;
                    }
                    else{
                        isBalanced = false;
                        break;
                    }
                }

                if(eachChar == '}') {
                    char check = st.pop();
                    if(check == '{') {
                        isBalanced = true;
                    }
                    else{
                        isBalanced = false;
                        break;
                    }
                }
                if(eachChar == ']') {
                    char check = st.pop();
                    if(check == '[') {
                        isBalanced = true;
                    }
                    else{
                        isBalanced = false;
                        break;
                    }
                }

            }
            //[}]
            System.out.println(isBalanced);
        }

    }
}
