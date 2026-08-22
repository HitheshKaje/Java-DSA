package Arrays;

import java.util.Arrays;

public class Right {
        public class Composite {
            public static void main(String[] args) {
                int[] arr = {10, 11, 34, 15, 16};
                for (int i = 1; i < arr.length; i++) {
                    arr[i + 1] = arr[i];
                }
                System.out.println(Arrays.toString(arr));


            }
        }
    }


