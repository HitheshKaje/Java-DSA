import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is using for loop");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("The array is using forEach loop");
        for(int s:arr){
            System.out.println(s);
        }
        sc.close();
    }


}
