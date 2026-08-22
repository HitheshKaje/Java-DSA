public class EvenOdd {
        public static void main(String[] args) {
            int[] arr = {23,76,98,4,8,9,67};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0&& i%2!=0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
