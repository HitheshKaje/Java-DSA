
public class DoublyLinked {
    DNode head;
    DNode tail;
    public  void addLast(int val){
        DNode n=new DNode( val);
            if(head== tail){
                head=n;
                tail=n;

            }else{
                tail.next=n;
                n.next=tail;
                tail=n;
            }

        }

        public  void addFirst(int val){
            DNode n=new DNode( val);
            if(head== tail){
                head=n;
                tail=n;

            }else{
                n.next=head;
                head.prev=n;
                head=n;

            }
        }
        public  void removeFirst(int val){
        if(head==null && tail==null){
            System.out.println("Nothing to remove");
            return;
        }
        else if(head==tail){
            head=null;
            tail=null;
            return;
        }else{
            Node temp=null;
            head=head.next;
            temp.next=null;
            head.prev=null;

        }
        }


    }
