package Sorting;

public class Bubble {
        public static  void main(String[] args) {
            int[] arr = {8, 4, 6, 3, 9, 1, 2};
            for (int i = 0; i <= arr.length - 1; i++) {
                for (int j = 0; j <= arr.length - i - 2; j++)
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
            }
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }

    }
