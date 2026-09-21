public class Additive {
    public static void main(String[] args) {
        System.out.println(isAdditiveNumber("112358"));
    }

    public static boolean isAdditiveNumber(String num) {

        int frst = Converter(num.charAt(0));
        int second = Converter(num.charAt(1));

        for (int i = 2; i < num.length(); i++) {

            int next = Converter(num.charAt(i));

            if (frst + second != next) {
                return false;
            }

            frst = second;
            second = next;
        }

        return true;
    }

    static int Converter(char ch) {
        int n = ch - '0';
        return n;
    }
}