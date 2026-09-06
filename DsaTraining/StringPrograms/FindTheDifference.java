public class FindTheDifference {
    public  static  void main(String[] args){
        String s = "abcd",t = "abcde";
        System.out.println(findTheDifference(s,t));

    }
    public static char findTheDifference(String s, String t) {
char temp=' ';

        for(int i=0;i<t.length();i++){
    char c=t.charAt(i);
    int count =0;
    for(int j=0;j<s.length();j++){
        if(c==s.charAt(j)){
            count++;        }

    }
    if(count==0){
        temp=c;
    }
}

return  temp;

    }
}
