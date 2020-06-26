/*
Given two binary trees, the task is to find if both of them are identical or not.  
Input:
3
1 2 3
1 2 3
1 2 3
1 3 2
1 2 3 N 3 N 10
1 2 3 N 3 N 10
Output:
Yes
No
Yes
*/

class Node { 
    int data; 
    Node left, right; 
   
    Node(int item) { 
        data = item; 
        left = right = null; 
    } 
} 
   
class Binary_Tree_Problem3 { 
    Node root1, root2; 
   
    
    boolean identicalTrees(Node a, Node b) { 
    
        if (a == null && b == null) {
            return true; 
        }
              
        if (a != null && b != null) {
            return (a.data == b.data 
                    && identicalTrees(a.left, b.left) 
                    && identicalTrees(a.right, b.right));
        } 
        return false; 
    } 
   
    public static void main(String[] args) { 
        Binary_Tree_Problem3 tree = new Binary_Tree_Problem3(); 
   
        tree.root1 = new Node(1); 
        tree.root1.left = new Node(2); 
        tree.root1.right = new Node(3); 
        tree.root1.left.left = new Node(4); 
        tree.root1.left.right = new Node(5); 
   
        tree.root2 = new Node(1); 
        tree.root2.left = new Node(2); 
        tree.root2.right = new Node(3); 
        tree.root2.left.left = new Node(4); 
        tree.root2.left.right = new Node(5); 
   
        if (tree.identicalTrees(tree.root1, tree.root2)) {
            System.out.println("Both trees are identical");
        } else {
            System.out.println("Trees are not identical"); 
        }
   
    } 
} 