package Binary_Tree;

public class node {
    int data;
    node left;
    node right;

    node(int key){
        data = key;
        left = right = null; //In JAVA 'null', c 'NULL', Python 'None'
        //System.out.println("Node " + data + " created");
    }
}
