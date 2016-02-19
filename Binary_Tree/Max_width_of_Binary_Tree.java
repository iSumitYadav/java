package Binary_Tree;
import java.util.*;

public class Max_width_of_Binary_Tree {

    static node root;

    //Compute the max width of binary tree
    public void GetMaxWidth(node root){
        if(root == null)
            return;

        int width = 0, size = 0;
        node temp;// = new node(1000);
        Queue<node> q = new LinkedList<node>();
        q.add(root);

        while(!q.isEmpty()){
            size = q.size();

            if(size > width){
                width = size;
            }

            while(size != 0) {
                temp = q.poll();

                if (temp.left != null)
                    q.add(temp.left);

                if (temp.right != null)
                    q.add(temp.right);

                size--;
            }
        }
        System.out.println("\nMax Width is " + width);
    }

    public static void main(String[] args) {
        Max_width_of_Binary_Tree tree = new Max_width_of_Binary_Tree();
        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        //tree.root.right.left = new node(6);
        tree.root.right.right = new node(7);
        tree.root.right.right.left = new node(8);
        tree.root.right.right.right = new node(9);
/*
        Tree_Traversal t = new Tree_Traversal();
        System.out.println("\nInorder Traversal");
        t.inorder(root);
        System.out.println("\nPreorder Traversal");
        t.preorder(root);
*/
        tree.GetMaxWidth(root);
    }
}