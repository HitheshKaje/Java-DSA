public class StackDriver {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s);
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s);
        s.peek();
        System.out.println(s);
    }
}