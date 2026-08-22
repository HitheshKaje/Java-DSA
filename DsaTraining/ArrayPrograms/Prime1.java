public class Prime1 {
    public static void main(String[] args) {
        int[] arr = {11,14,23,13,67,32};
        for (int i = 0; i < arr.length ; i++) {
            int s=Prime(arr[i]);
            if(s!=0) {
                System.out.println(s);
            }

        }



    }
    static int Prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;

            }
        }
        if(count>2)
            return  0;
        else
            return n;
    }

}