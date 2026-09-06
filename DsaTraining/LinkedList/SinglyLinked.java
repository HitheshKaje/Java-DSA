import java.util.Stack;

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

        } else if (head == tail) {
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

        } else if (head == tail) {
            head = null;
            tail = null;
            System.out.println("node removed");
            return;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void Size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        System.out.println("The size of the list is :" + count);
    }

    public void Remove() {
        if (head == null) {
            System.out.println("nothing to remove");
            return;
        } else {
            while (head != null) {
                System.out.println(head.data + " removed from the list");
                head = head.next;

            }

        }

    }

    public void getElement(int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (index == position) {
                System.out.println("Element found at the given postion is " + temp.data);
                return;
            }
            temp = temp.next;
            index++;


        }
        System.out.println("No element found at this posotion");

    }

    public void Reverses() {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        for (int i = size - 1; i >= 0; i--) {
            temp = head;
            int index = 0;
            while (index < i) {
                temp = temp.next;
                index++;

            }
            System.out.println(temp.data + " ");
        }


    }


    public void Maximum() {

        if (head == null) {
            System.out.println("No node in the list");
        } else {
            int max = head.data;
            Node temp = head;
            while (temp != null) {
                if (temp.data > max) {
                    max = temp.data;
                }
                temp = temp.next;
            }
            System.out.println("The maximum element is: " + max);
            return;
        }
    }

    public void Average() {
        if (head == null) {
            System.out.println("No node in the list");
        } else {
            int sum = 0;
            double average = 0;
            Node temp = head;
            int elementcount = 0;
            while (temp != null) {
                elementcount++;
                sum += temp.data;
                temp = temp.next;
            }
            average = sum / elementcount;
            System.out.println("The avaereage of the Elemet  int the list is : " + average);

        }

    }

    public void Middle() {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 1; i <= size / 2; i++) {

            temp = temp.next;

        }
        System.out.println("The middle element is " + temp.data);

    }
public  void PositionAdd(int position,int val){

        if(position<0){
            System.out.println("Invalid position");
        }  Node n = new Node(val);
        if (position == 0) {
        n.next = head;
        head = n;
        return;
    } Node temp=head;
        for(int i=0;i<position-1;i++){
                temp=temp.next;
        }
                n.next=temp.next;
                temp.next=n;


            System.out.println("Element inserted At position");
        }



    public  void RemoveAllOccurence(int val){
        if(head==null){
            System.out.println("No nodes to remove");
        }
        while (head!=null && head.data==val){
            head=head.next;
        }
        Node temp=head;
        while (temp!=null && temp.next!=null) {
            if (temp.next.data == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

    }

public  void Palimdrome(){
    Stack<Integer> s= new Stack();
        Node temp=head;
        while (temp!=null){
            s.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null){
            if(temp.data!=s.pop()){
                System.out.println("Not a palindrome");
                return;
            }
            temp=temp.next;

        }
    System.out.println("Palindrome");
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