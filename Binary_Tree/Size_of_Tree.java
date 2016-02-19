package Binary_Tree;

public class Size_of_Tree {
    static node root;

    public int size(node root){
        if(root == null)
            return 0;

        return size(root.left) + 1 + size(root.right);
    }
    public static void main(String[] args) {
        Size_of_Tree tree = new Size_of_Tree();
        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.root.right.left = new node(6);
        tree.root.right.right = new node(7);
        //tree.root.right.right.left = new node(8);

        System.out.println(tree.size(root));
    }
}
