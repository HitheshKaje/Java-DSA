public class Copy {
    public static void main(String[] args) {
        int[] arr = {11, 14, 23, 13, 67, 32};
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];


        }

        for(int ele:arr1)
        {
            System.out.println(ele);
        }
    }
}
