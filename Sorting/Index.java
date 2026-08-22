import java.util.ArrayList;
import java.util.List;

public class Index {
    public static  void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

       int[]res= GetArray(nums, index);

       for(int i=0;i<res.length;i++){
           System.out.println(res[i]);
       }
        }

    static  int[]  GetArray(int[]nums,int[]index) {

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            arr.add(index[i], nums[i]);

        }
        int[] target = new int[arr.size()];
        for (int i = 0; i < nums.length; i++) {
            target[i] = arr.get(i);

        }
        return target;
    }


}
