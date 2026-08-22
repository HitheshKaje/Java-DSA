public class Primesss {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i < n; i++) {
            if (Isprime(i)) {
            }


        }
    }


        static boolean Isprime ( int n){
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            return count == 2;
        }
    }