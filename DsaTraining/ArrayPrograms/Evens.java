public class Evens {
    public static void main(String[] args) {
        int[] arr = {10,15,16,19,20};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }

            }
              int arr1[]=new int[count];
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0){
                arr1[index]=arr[i];
                index++;
            }
        }
        System.out.println();
        for(int i=0;i<arr1.length-1;i++)
        System.out.println(arr1[i]);
            }
}
