public class Queue {
    int size;
    int front;
    int rear;
    int []queue;

    Queue(int size){
        this.size=size;
         queue =new int[size];
        front=0;
        rear=-1;


    }

    public  void enque(int val){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear]=val;
        System.out.println(val+" inserted");
    }

    public  void deque(){
        if(front>rear){
            System.out.println("No elements");
            return;
        }
        System.out.println(queue[front]+ " dequed");
        front++;
    }

    void peek(){
        if(front>rear){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element="+ queue[front]);
    }
    public String toString() {
        if (front>rear) {
            return "Stack is Empty";
        }
        String result = "";
        for (int i = front; i <= rear; i++) {
            result = result + queue[i] + " ";
        }
        return result;
    }



}
