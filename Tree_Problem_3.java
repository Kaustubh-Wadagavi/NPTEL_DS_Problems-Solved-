/*Given a binary tree, find its height.
Sample Input:
3
1 2 3
2 N 1 3 N
10 20 30 40 60 N N

Sample Output:
2
3
3
*/

class Node { 
    int data; 
    Node left, right; 
   
    Node(int item) { 
        data = item; 
        left = right = null; 
    } 
} 
   
class Tree_Problem_3 { 
    Node root; 
    int maxDepth(Node node) { 
        if (node == null) {
            return 0; 
        } else {
            int lDepth = maxDepth(node.left); 
            int rDepth = maxDepth(node.right); 
   
        if (lDepth > rDepth) {
                return (lDepth + 1);
            } else { 
                return (rDepth + 1); 
            }
        } 
    } 
       
    public static void main(String[] args) { 
        Tree_Problem_3 tree = new Tree_Problem_3(); 
   
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
   
        System.out.println("Height of tree is : " +  tree.maxDepth(tree.root)); 
    } 
} 