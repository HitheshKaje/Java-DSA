public class Solution {
    public static char great(char[]letters,char target){
        int low=0,high=letters.length-1,mid;
        while(low<=high){
            mid=low+(high-low)/2;

            if(target<letters[mid]){
                high=mid-1;

            }else{

                low=mid+1;
            }
        }
        return letters[low % letters.length];

    }

    public static void main(String[] args){
        char[]letters={'c','f','j'};
        char target='g';
        char res=great(letters,target);
        System.out.println(res);

    }
}
