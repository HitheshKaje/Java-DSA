public class Smaller {
    public static void main(String[] argd) {
        int num[] = {8, 1, 2, 2, 3};
        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {

                if (num[j] < num[i]) {
                    count++;
                }
                }
                System.out.println(count);
            }
        }
    }
