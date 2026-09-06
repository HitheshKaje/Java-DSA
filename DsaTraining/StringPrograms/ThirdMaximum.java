import java.util.ArrayList;
import java.util.List;

public class ThirdMaximum {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1},nums2={2,2};
        System.out.println(intersection(nums1,nums2));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int count=0;
        for (int i=0;i<nums1.length;i++){
            int k=nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(k==nums2[j]&&k!=-1){
                 count++;
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int [] arr=new int[count];
        int index=0;
        for (int i=0;i<nums1.length;i++){
            int k=nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(k==nums2[j] && k!=-1){
                   arr[index]=k;
                   index++;
                   nums2[j]=-1;
                   break;
                }
            }
        }

        for(int num:arr){
            System.out.println(num);
        }



        return  arr;




    }
}
