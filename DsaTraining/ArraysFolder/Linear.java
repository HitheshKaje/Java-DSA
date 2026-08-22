import java.util.Scanner;

public class Linear {
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Found at position"+ i);
                return;
            }

            }
        System.out.println("Not found");

    }
    }

