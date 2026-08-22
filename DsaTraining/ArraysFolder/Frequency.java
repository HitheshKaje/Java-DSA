public class Frequency {
    public static void main(String[] args) {
//        int[] arr = {10, 20, 10, 30, 10, 10};
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            if(arr[i]==-1){
//                continue;
//            }
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    arr[j]=-1;
//                }
//            }
//            System.out.println(arr[i] + "=" + count);
//        }
//
//
//    }

        int[] arr = {10, 20, 10, 30, 10, 10};
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
                System.out.println(val+ "=" + count);

            }

        }
        }
    }