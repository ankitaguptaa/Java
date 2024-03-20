public class Fibbonacci {

    public static void main(String[] args) {
    }
    public static int factorial(int input) {
        int i = 0;
        int j = 1;
        for (int n = 0; n < input; n++) {
            int k = i + j;
            i = j;
            j = k;
        }
        System.out.println(j);
        return j;
    }

}
