/*

Given a Binary Search Tree (with all values unique) and two node values. Find the Lowest Common Ancestors of the two nodes in the BST.

Input: 
2
5 4 6 3 N N 7 N N N 8
7 8
2 1 3
1 3
Output:
7
2

*/

class Node { 
    int data; 
    Node left, right; 
   
    Node(int item) { 
        data = item; 
        left = right = null; 
    } 
} 
   
class Binary_Tree_Problem1 { 
    Node root; 
       
    Node leftCommonAncestors(Node node, int n1, int n2) { 
        if (node == null) {
            return null; 
        }
        if (node.data > n1 && node.data > n2) {
            return leftCommonAncestors(node.left, n1, n2); 
        }
   
        if (node.data < n1 && node.data < n2) {
            return leftCommonAncestors(node.right, n1, n2);
        }
             
   
        return node; 
    } 
   
    public static void main(String args[]) { 
        Binary_Tree_Problem1 tree = new Binary_Tree_Problem1(); 
        tree.root = new Node(20); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(22); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(12); 
        tree.root.left.right.left = new Node(10); 
        tree.root.left.right.right = new Node(14); 
   
        int n1 = 10, n2 = 14; 
        Node t = tree.leftCommonAncestors(tree.root, n1, n2); 
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
   
        n1 = 14; 
        n2 = 8; 
        t = tree.leftCommonAncestors(tree.root, n1, n2); 
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
   
        n1 = 10; 
        n2 = 22; 
        t = tree.leftCommonAncestors(tree.root, n1, n2); 
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data); 
   
    } 
} 