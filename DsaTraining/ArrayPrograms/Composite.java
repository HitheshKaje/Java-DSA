public class Composite {
    public static void main(String[] args) {
        int[] arr = {10, 11, 34, 15, 16, 19, 20, 23};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!Prime(arr[i])) {
                if (i % 2 != 0) {
                    count++;
                }

            }
        }
        int arr1[] = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (!Prime(arr[i])) {
                if (i % 2 != 0) {
                    arr1[index] = arr[i];
                    index++;
                }
            }
        }
        System.out.println();
        for(int i=0;i<arr1.length-1;i++)
            System.out.println(arr1[i]);
    }
    static boolean Prime ( int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

            }
        }
        if(count== 2)return  true;
        else
            return false;
    }

}
