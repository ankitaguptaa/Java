public class ReverseString {

    public static void main(String[] args) {

        String s = "aeious bcs";
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--){
            reverse.append(s.charAt(i));
        }
        System.out.println(reverse);
    }

    //Test
   // string = null
    // string = empty
    // spaces

}
