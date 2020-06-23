/*
Given a binary tree, connect the nodes that are at same level. You'll be given an addition nextRight pointer for the same.
      
      10                           10 ------> NULL
      / \                       /      \
     3   5       =>     3 ------> 5 --------> NULL
    / \     \               /  \           \
   4   1   2          4 --> 1 -----> 2 -------> NULL

*/
import java.util.*; 
import java.io.*; 
class Node { 
    int data; 
    Node left, right, nextRight; 
  
    Node(int item) 
    { 
        data = item; 
        left = right = nextRight = null; 
    } 
} 
  
public class Tree_Problem_2 { 
    Node root; 
    void connect(Node p) { 
         
        Queue<Node> q = new LinkedList<>(); 
  
        q.add(root); // adding nodes to tehe queue 
  
        Node temp = null; 
        while (!q.isEmpty()) { 
            int n = q.size(); 
            for (int i = 0; i < n; i++) { 
                Node prev = temp; 
                temp = q.poll(); 
  
                if (i > 0) 
                    prev.nextRight = temp;  
  
                if (temp.left != null) 
                    q.add(temp.left); 
  
                if (temp.right != null) 
                    q.add(temp.right); 
            } 
  
            temp.nextRight = null;  
        } 
    } 
  
    public static void main(String args[]) { 
        Tree_Problem_2 tree = new Tree_Problem_2(); 
  
        /* Constructed binary tree is  
             10  
            /  \  
          8     2  
         /       \
        3         5
        */

        tree.root = new Node(10); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
   
        tree.connect(tree.root); 
  
        System.out.println("Following are populated nextRight pointers in "
                           + "the tree" + "(-1 is printed if there is no nextRight)"); 
        int a = tree.root.nextRight != null ? tree.root.nextRight.data : -1; 
        System.out.println("nextRight of " + tree.root.data + " is " + a); 
        int b = tree.root.left.nextRight != null ? tree.root.left.nextRight.data : -1; 
        System.out.println("nextRight of " + tree.root.left.data + " is " + b); 
        int c = tree.root.right.nextRight != null ? tree.root.right.nextRight.data : -1; 
        System.out.println("nextRight of " + tree.root.right.data + " is " + c); 
        int d = tree.root.left.left.nextRight != null ? tree.root.left.left.nextRight.data : -1; 
        System.out.println("nextRight of " + tree.root.left.left.data + " is " + d); 
    } 
} 