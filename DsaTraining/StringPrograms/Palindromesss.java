public class Palindromesss {
    public  static  void main(String[] args){
      String s="A man, a plan, a canal: Panama";
            String temp="";
            for(int i=s.length()-1;i>=0;i--){
                char ch=s.charAt(i);
                temp=ch+temp;
            }
            if(temp.equals(s)){
                System.out.println("YEs");
                return;
            }
           System.out.println("NO");

        }
    }
