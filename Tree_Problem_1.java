/* 
Complete the function to print spiral order traversal of a tree. For below tree, function should print 1, 2, 3, 4, 5, 6, 7.
The task is to complete the function printSpiral() which prints the elements in spiral form of level order traversal. The newline is automatically appended by the driver code.

Input:
2
1 3 2  
10 20 30 40 60 

Output:
1 3 2
10 20 30 60 40 
*/


class Node { 
    int data; 
    Node left, right; 
  
    public Node(int d) 
    { 
        data = d; 
        left = right = null; 
    } 
} 

class Tree_Problem_1 {
    Node root;

    void printSpiral(Node node) {
        int h = height(node);
        int i;
        boolean result = false;
        for(i = 1; i <= h; i++) {
            printGivenLevel(node, i, result);
            result = !result;
        }
    }

    int height(Node node) {
        if(node == null) {
            return 0;
        } else {
            int lheight = height(node.left);
            int rheight = height(node.right);
        
            if(lheight > rheight) {
                return(lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }

    void printGivenLevel(Node node, int level, boolean ltr) 
    { 
        if (node == null) 
            return; 
        if (level == 1) 
            System.out.print(node.data + " "); 
        else if (level > 1) { 
            if (ltr != false) { 
                printGivenLevel(node.left, level - 1, ltr); 
                printGivenLevel(node.right, level - 1, ltr); 
            } 
            else { 
                printGivenLevel(node.right, level - 1, ltr); 
                printGivenLevel(node.left, level - 1, ltr); 
            } 
        } 
    }

    public static void main(String[] args) { 
        Tree_Problem_1 spiralTree = new Tree_Problem_1(); 
        spiralTree.root = new Node(1); 
        spiralTree.root.left = new Node(2); 
        spiralTree.root.right = new Node(3); 
        spiralTree.root.left.left = new Node(7); 
        spiralTree.root.left.right = new Node(6); 
        spiralTree.root.right.left = new Node(5); 
        spiralTree.root.right.right = new Node(4); 
        System.out.println("Spiral order traversal of Binary Tree is "); 
        spiralTree.printSpiral(spiralTree.root); 
    } 
}