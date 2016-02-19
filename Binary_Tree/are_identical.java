package Binary_Tree;

public class are_identical {
    static node root1;
    static node root2;

    public static boolean areIdentical(node root1, node root2){
        if(root1 == null && root2 == null)
                return true;

        if(root1 == null || root2 == null)
                return false;

        return (root1.data == root2.data)
                && areIdentical(root1.left, root2.left)
                && areIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        are_identical tree = new are_identical();
        tree.root1 = new node(1);
        tree.root1.left = new node(2);
        tree.root1.right = new node(3);
        tree.root1.left.left = new node(4);
        tree.root1.left.right = new node(5);
        tree.root1.right.left = new node(6);
        tree.root1.right.right = new node(7);

        //are_identical tree = new are_identical();
        tree.root2 = new node(1);
        tree.root2.left = new node(2);
        tree.root2.right = new node(3);
        tree.root2.left.left = new node(4);
        tree.root2.left.right = new node(5);
        tree.root2.right.left = new node(6);
        tree.root2.right.right = new node(7);

        if(areIdentical(root1, root2))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
