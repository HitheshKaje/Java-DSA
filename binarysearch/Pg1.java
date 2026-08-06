import java.util.ArrayList;
import java.util.LinkedList;

public class Pg1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("World");
        words.add("10");
        words.add("20");


        String item=words.get(0);
        System.out.println(item+words.get(1));


        LinkedList<Integer>number=new LinkedList<Integer>();
        number.add(10);
        number.add(20);
        number.add(40);

        System.out.println(number);
        number.remove(2);
        System.out.println(number);
        for(int num:number){
            System.out.print(" "+num);
        }

    }
}
