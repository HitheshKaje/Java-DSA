package Serching.Serching;

public class serachindex {
    public static void main(String[] args) {
        int[] arr={3,2,5,4,44,33,22,99,88};
        int target=88;
        int start=4;
        int end=7;
        System.out.println(linerSerach(arr,target,start,end));
    }
        static int linerSerach(int[] arr, int target,int start,int end) {
            if (arr.length == 0) {
                return -1;
            }
            for (int index = start; index <= end; index++) {
                int element = arr[index];
                if (element == target) {
                    return index;
                }

            }
            return -1;
        }
    }

































