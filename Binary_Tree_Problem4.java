/*
Given a Binary Tree. Check whether it is Symmetric or not, i.e. whether the binary tree is a Mirror image of itself or not.
For example:
The following binary tree is symmetric:

        1
      /   \
    2       2
  /   \   /   \
 3     4 4     3

But the following is not:

       1
     /   \
    2      2
     \      \
      3      3

*/

class Node { 
    int key; 
    Node left, right; 
   
    Node(int item) { 
        key = item; 
        left = right = null; 
    } 
} 
   
class Binary_Tree_Problem4 { 
    Node root; 
   
    boolean isMirror(Node node1, Node node2){ 
        if (node1 == null && node2 == null) { 
            return true; 
        }
   
        if (node1 != null && node2 != null && node1.key == node2.key) {
            return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left)); 
        }
   
        return false; 
    } 
   
    boolean isSymmetric(Node node) { 
        return isMirror(root, root); 
    } 
   
    
    public static void main(String args[]) { 
        Binary_Tree_Problem4 tree = new Binary_Tree_Problem4(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
        tree.root.left.right = new Node(4); 
        tree.root.right.left = new Node(4); 
        tree.root.right.right = new Node(3); 
        boolean output = tree.isSymmetric(tree.root); 
        
        if (output == true) { 
            System.out.println("Tree is Mirror"); 
        } else {
            System.out.println("Tree is Not Mirror"); 
        }
    } 
} 