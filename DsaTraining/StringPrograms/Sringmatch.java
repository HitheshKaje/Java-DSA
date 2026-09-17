public class Sringmatch {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String temp = "";
        String words = "";
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                words =s.charAt(i)+words;

            } else {
                temp = temp + " ";

            }

            temp = temp + words;
            words = "";


        }
        return  temp;
    }
}
