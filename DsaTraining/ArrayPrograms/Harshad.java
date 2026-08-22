public class Harshad {
    public static void main(String[] args) {
        int[] arr = {10, 11, 7, 18, 16, 19, 20, 23};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Harshad(arr[i])) {
                count++;

            }
        }
        int arr1[] = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (!Harshad(arr[i])) {
                arr1[index] = arr[i];
                index++;
            }

        }
        for(int i=0;i<arr1.length-1;i++)
            System.out.println(arr1[i]);

    }



    static boolean Harshad ( int n) {
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            int last = temp % 10;
            sum += last;
            n = n / 10;

        }



        return n % sum == 0;
    }

}

