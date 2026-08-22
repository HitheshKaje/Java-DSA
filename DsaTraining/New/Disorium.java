import java.util.Scanner;

public class Disorium {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int original =n;
            int dis=  Disorium(n);
            if(original==dis){
                System.out.println("Disorium  number");
            }else{
                System.out.println("Not a Disourium Number");
            }

        }

        public static  int Disorium(int n) {
            int num = n;
            int count = 0;
            int sum = 0;
            while (n != 0) {
                int last = n % 10;
                count++;
                n = n / 10;
            }
            int res= Power(count,num);
            return res;
        }


        static int Power(int count,int num){
            int sum=0;
            while(num!=0){

                int last=num%10;
                int  finals=1;
                for(int i=1; i<=count;i++){
                    finals= finals * last;
                     count--;
                }
                sum+=finals;
                num=num/10;
            }
            return sum;

        }
    }

