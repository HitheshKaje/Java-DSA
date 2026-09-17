public class Longest {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        for (int i = 0; i < strs.length; i++) {
            String frst = strs[i + 1];
            for (int j = 0; j < temp.length(); j++) {
                char ch = temp.charAt(j);
                for (int k = 0; k <=frst.length(); k++) {
                    char ch1 = frst.charAt(k);
                    if (ch == ch1) {
                        temp += ch;
                    }


                }


            }
        }
        return  temp;
    }
}
