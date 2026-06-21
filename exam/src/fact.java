public class fact {
    static void main(String[] args) {
        int i=1;
        int res=1;
        while(i<=10){
            res*=i;
            System.out.println("Factorial  of "+i+" is "+res);
            i++;
        }
    }
}
