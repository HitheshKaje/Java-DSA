
public class DoublyLinked {
    DNode head;
    DNode tail;

    public void addLast(int val) {
        DNode node = new DNode(val);
        if (head == null) {
            head = node;
            tail = node;

        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        System.out.println("The node added at the last");

    }

    public void addFirst(int val) {
        DNode n = new DNode(val);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;

        }
        System.out.println("The node added at the Beginning");

    }

    public void removeFirst(int val) {
        if (head == null && tail == null) {
            System.out.println("Nothing to remove");
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
            return;
        } else {
            Node temp = null;
            head = head.next;
            temp.next = null;
            head.prev = null;

        }
        System.out.println("The node Removed from the First ");

    }

    public void Removelast() {
        if (head == null && tail == null) {
            System.out.println("Nothing to remove");
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
            return;

        } else {
            DNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;

        }

        System.out.println("The node Removed from the Last ");
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        String res = "";
        DNode curr = head;
        while (curr != null) {
            res = res + curr.val + " ";
            curr = curr.next;
        }
        return res;
    }

    public void Size() {
        DNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        System.out.println("the size is: " + count);

    }

    public void Average() {
        if (head == null) {
            System.out.println("No node in the list");
        } else {
            int sum = 0;
            double average = 0;
            DNode temp = head;
            int elementcount = 0;
            while (temp != null) {
                elementcount++;
                sum += temp.val;
                temp = temp.next;
            }
            average = sum / elementcount;
            System.out.println("The avaereage of the Elemet  int the list is : " + average);

        }

    }

    public void Maximum() {

        if (head == null) {
            System.out.println("No node in the list");
        } else {
            int max = head.val;
            DNode temp = head;
            while (temp != null) {
                if (temp.val > max) {
                    max = temp.val;
                }
                temp = temp.next;
            }
            System.out.println("The maximum element is: " + max);
            return;
        }
    }

    public void getElement(int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        DNode temp = head;
        int index = 0;
        while (temp != null) {
            if (index == position) {
                System.out.println("Element found at the given postion is " + temp.val);
                return;
            }
            temp = temp.next;
            index++;


        }
    }

    public void Reverses() {
        DNode temp = tail;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }

    }

//    public void Remove() {
//        head = null;
//        tail = null;
//    }
    public void Remove() {
        DNode temp = head;

        while (temp != null) {
            DNode nextNode = temp.next;

            temp.prev = null;
            temp.next = null;

            temp = nextNode;
        }

        head = null;
        tail = null;
    }
}