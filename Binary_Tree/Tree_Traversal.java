package Binary_Tree;

public class Tree_Traversal {
    public void inorder(node root){
        if(root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    protected void preorder(node root){//Notice the protected access specifier
        if(root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
}
