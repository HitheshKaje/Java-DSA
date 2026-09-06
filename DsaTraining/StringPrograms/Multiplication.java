public class Multiplication {
    public static void main(String[] args) {
        String s1 = "2", s2 = "3";
        System.out.println(multiply(s1, s2));
    }

    public static String multiply(String num1, String num2) {
        int n1 =0;
        int n2=0;

        for (int i = 0; i < num1.length(); i++) {
            char ch = num1.charAt(i);
             n1 = n1 * 10 + (ch - '0');

        }
        for (int j = 0; j < num2.length(); j++) {
            char ch = num2.charAt(j);
            n2 = n2 * 10 + (ch - '0');

        }

        int product = n1 * n2;
        String temp = "";
        while (product != 0) {
            int last = product % 10;
            temp = (last + '0') + temp;
            product = product / 10;

        }

        return temp;
    }
}
