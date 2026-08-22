public class Square {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num / 2;
        if(num== 1)return true;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid == num) {
                return true;
            } else if (num > (long) mid * mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }


        }
        return false;
    }
}