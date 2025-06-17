package Tree;

class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} 

class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        if(node == null){
            return;
        }
        mirror(node.left);
        mirror(node.right);
        
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
public class MirrorTreeGFG {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        Solution solution = new Solution();
        solution.mirror(root);
        
        // Print the mirrored tree (in-order traversal)
        printInOrder(root);
    }
    
    static void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }
}