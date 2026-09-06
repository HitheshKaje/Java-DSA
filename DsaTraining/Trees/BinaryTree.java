public class BinaryTree {

    static BNode root;

    public static void Inorder(BNode root) {
        if (root == null)
            return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public  static  void PreOrder(BNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");

        PreOrder(root.left);
        PreOrder(root.right);
    }

    public  static  void  PostOrder(BNode root){
        if(root == null)
            return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");

    }


    public static void main(String[] args) {
        root = new BNode(10);
        root.left = new BNode(20);
        root.right = new BNode(30);
        root.left.left = new BNode(40);
        root.left.right = new BNode(50);
        root.right.left = new BNode(60);
        root.right.right = new BNode(70);
        Inorder(root);
        System.out.println();
        PreOrder(root);
        System.out.println();
        PostOrder(root);
    }
}
