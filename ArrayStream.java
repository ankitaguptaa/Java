import java.util.Arrays;

public class ArrayStream {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        int[] arr = {1,2,3,4};
        int[] brr = new int[]{1,2,3};
        String[] bird = {"sparrow","magpie"};
        String[] animal  = new String[]{"dog","cat"};

//        for (int j : arr) {
//            System.out.println(j);
//        }
//        for (String eachAnimal : animal){
//            System.out.println(eachAnimal);
//        }

        Arrays.stream(brr).forEach(System.out::print);
        Arrays.stream(bird).forEach(System.out::println);


    }
}