import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        Intersection i = new Intersection();
        i.intersection(nums1,nums2);
    }
    public int[] intersection(int[] nums1, int[] nums2){

        Set<Integer> result = new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            for(int j =0; j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    result.add(nums1[i]);
                   break;
                }
            }
        }
        System.out.println(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
