public class Queuedriver {
    public static void main(String[] args){
        Queue q=new Queue(5);
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        System.out.println(q);

        q.deque();
        q.deque();
        q.deque();
        System.out.println(q);
q.enque(10);
q.enque(20);


        System.out.println(q);
    }
}
