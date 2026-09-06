import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersections {
    public static  void main(String[] args){
       int[] nums1={1,2,2,1},nums2={2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        for (int i=0;i<nums1.length;i++){
            int num1=nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(num1==nums2[j]&&!list.contains(num1)){
                    list.add(num1);
                    break;

                }
            }
        }
        int []result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return  result;
    }

}
