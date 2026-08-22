public class Max {
    public static void main(String[] args){

    int[] arr = {10, 20, 10, 30, 10, 10};
        int maxval=arr[0];
        int maxcount=0;
        for (int i = 0; i < arr.length; i++) {
        int val=arr[i];
        int count=0;
        if(val!=-1){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==val){
                    count++;
                    arr[j]=-1;
                }
            }

            if(count>maxcount){
                maxval=val;
                maxcount=count;
                System.out.println();
            }


        }


    }
        System.out.println(maxval+"and its count is"+maxcount);

    }
}
