public class SiglyLinkedListTriver {
    public  static  void  main(String[] args){
        SinglyLinked s= new SinglyLinked();
        s.addList(10);
        s.addList(20);
        s.addList(30);
        s.addList(40);
        s.addList(50);
        s.addList(60);
        s.addList(70);
        s.addF(50);
        s.removeF();
        s.removeF();

        System.out.println(s);
    }


}
