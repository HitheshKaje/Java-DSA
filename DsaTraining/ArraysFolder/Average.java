public class Average {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 90, 50, 60,10};
        int count = 0;
        int sum=0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum+=arr[i];
                     count++;
            }
        int average=0;
        average=sum/count;
        System.out.println(average);
        }


    }
