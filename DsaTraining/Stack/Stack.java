public class Stack {
    int stack[];
    int top = -1;
    int size;

    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }


    public void push(int val) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = val;
        System.out.println(val + " Isreted");
    }


    public void pop() {
        if (top == -1) {
            System.out.println("No elemets to remove");
        }
        System.out.println(stack[top] + " popped");
        top--;
    }

    public void peek() {
        if (top == -1) {
            System.out.println("No elemets to remove");
        }
        System.out.println("Top element is " + stack[top]);
    }

    public String toString() {
        if (top == -1) {
            return "Stack is Empty";
        }
        String result = "";
        for (int i = 0; i <= top; i++) {
            result = result + stack[i] + " ";
        }
        return result;
    }
}
