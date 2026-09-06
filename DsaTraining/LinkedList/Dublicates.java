import java.util.Arrays;

public class Dublicates {
    public static void main(String[] args) {
        String[] arr = {"0", "0", "1", "1", "1", "2", "2", "3", "3", "4"};
        int index = 1;
        for (int i=1;i<arr.length;i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
            while (index<arr.length){
                arr[index]="_";
                index++;

        }

        System.out.println(Arrays.toString(arr));
    }
}
