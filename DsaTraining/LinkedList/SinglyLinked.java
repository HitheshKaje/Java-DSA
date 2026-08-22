public class SinglyLinked {
    Node head;
    Node tail;

    public void addList(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void addF(int val) {
        Node n = new Node(val);
        if (head == null && tail == null) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void removeF() {
        if (head == null) {
            System.out.println("nothing to remove");
            return;

        }
        else if (head == tail) {
            head = null;
            tail = null;
            System.out.println("node removed");
            return;
        } else {
            head = head.next;
        }
    }
    public void removeL() {
        if (head == null) {
            System.out.println("nothing to remove");
            return;

        }
        else if (head == tail) {
            head = null;
            tail = null;
            System.out.println("node removed");
            return;
        } else {
            Node temp=head;
            while (temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }
    public String toString(){
        if(head==null){
            return "[]";
        }
        String res="";
        Node curr=head;
        while (curr!=null){
            res=res+curr.data+" ";
            curr=curr.next;
        }
        return res;
    }
}