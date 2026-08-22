public class Primes {
    public static void main(String[] args) {
        int[] arr = {10,11,7, 15, 16, 19, 20,23};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (Prime(arr[i])) {
                count++;
                System.out.print(arr[i]+" ");

            }
        }
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
