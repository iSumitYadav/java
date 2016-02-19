package Binary_Tree;
import java.util.*;

public class Print_Nodes_At_K_Dist{

    static node root;   //static is used with node coz to maintain only one root,
    // otherwise there will be root for every other object

    public void kDist(node root, int k){
        if(root == null)
            return;

        if(k == 0)
            System.out.print(root.data + " ");

        kDist(root.left, k-1);
        kDist(root.right, k-1);
    }

    public static void main(String[] args){
        Print_Nodes_At_K_Dist tree = new Print_Nodes_At_K_Dist();

        tree.root = new node(1);
        tree.root.left = new node(2);
        tree.root.right = new node(3);
        tree.root.left.left = new node(4);
        tree.root.left.right = new node(5);
        tree.root.right.left = new node(6);
        tree.root.right.right = new node(7);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter k: ");
        int k = input.nextInt();
        tree.kDist(root, k);

        input.close();      //Prevent Memory Leak :)
    }
}
