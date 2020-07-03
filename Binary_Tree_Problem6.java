/*Given a Binary Tree, find diameter of it.
Input:
2
1 2 3
10 20 30 40 60 

Output:
3
4
*/

class Node { 
    int data; 
    Node left, right; 
  
    public Node(int item) { 
        data = item; 
        left = right = null; 
    } 
} 

class Binary_Tree_Problem6 { 
    Node root; 
  
    int diameter(Node root) { 
        if (root == null) 
            return 0; 

        int lheight = height(root.left); 
        int rheight = height(root.right); 

        int ldiameter = diameter(root.left); 
        int rdiameter = diameter(root.right); 

        return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter)); 
  
    } 

    int diameter() { 
        return diameter(root); 
    } 
  
    static int height(Node node) { 
        if (node == null) {
            return 0; 
        }

        return (1 + Math.max(height(node.left), height(node.right))); 
    } 
  
    public static void main(String args[]) { 
        Binary_Tree_Problem6 tree = new Binary_Tree_Problem6(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("The diameter of given binary tree is : "+ tree.diameter()); 
    } 
} 