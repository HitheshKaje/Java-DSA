import java.util.HashSet;
 class Pg5 {
    String name;
    int age;
    public Pg5(String name,int age){
        super();
        this.name=name;
        this.age=age;

    }
    @Override
    public String toString(){
        return "Pg3[name="+name+",age="+age+"]";
    }
}

public class Pg2 {
    public static void main(String[]args){
        HashSet<Pg3>values=new HashSet<Pg3>();
        Pg3 obj=new Pg3("dog",13);
        Pg3 obj1=new Pg3("cat",14);
        Pg3 obj2=new Pg3("liao",15);
        Pg3 obj3=new Pg3("tiger",16);
        values.add(obj);
        values.add(obj1);
        values.add(obj2);
        values.add(obj3);



        for(Pg3 val:values){
            System.out.println(val);
        }


    }
}
