/*Given a Binary Tree of size N , You have to count leaves in it. For example, there are two leaves in following tree

        1
     /      \
   10      39
  /
5

Input:
2
3 4 2 
4 8 10 7 N 5 1 3 
Output:
2
3
*/

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 
   
public class Binary_Tree_Problem7  
{ 
    Node root; 
       
    int getLeafCount()  
    { 
        return getLeafCount(root); 
    } 
   
    int getLeafCount(Node node)  
    { 
        if (node == null) 
            return 0; 
        if (node.left == null && node.right == null) 
            return 1; 
        else
            return getLeafCount(node.left) + getLeafCount(node.right); 
    } 
   
    public static void main(String args[])  
    { 
        /* create a tree */
        Binary_Tree_Problem7 tree = new Binary_Tree_Problem7(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
           
        /* get leaf count of the abve tree */
        System.out.println("The leaf count of binary tree is : "+ tree.getLeafCount()); 
    } 
} 