

public class Concat {
    static void concatenatrion(int arr[],int arr1[]){
       int[] result=new int[arr.length+arr1.length];
       int i;
       for( i=0;i<arr.length;i++) {
            result[i] = arr[i];
        }
            for(int  j=0;j<arr1.length;j++){
               result[i+j]=arr[j];
            }
          for(int k=0;k<result.length;k++){
              System.out.print(result[k]+"  ");
          }
        }



    public static void main(String[] args){
        int arr[]={1,23,4,5,6};
        int arr1[]={8,7,77,55,44};
        concatenatrion(arr,arr1);

    }
}
