/*
Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL.

Input:
2
1 3 2
10 20 30 40 60
Output:
3 1 2
2 1 3
40 20 60 10 30
30 10 60 20 40

*/

class Node { 
    int data; 
    Node left, right; 
   
    public Node(int data) { 
        this.data = data; 
        left = right = null; 
    } 
} 
   
class Binary_Tree_Problem2 { 
    Node root; 

    Node head; 
       
    static Node prev = null; 
   
    void BinaryTree2DoubleLinkedList(Node root) { 
        if (root == null) { 
            return; 
        }
   
        BinaryTree2DoubleLinkedList(root.left); 
   
        if (prev == null) {  
            head = root; 
        } else { 
            root.left = prev; 
            prev.right = root; 
        } 
        prev = root; 
        BinaryTree2DoubleLinkedList(root.right); 
    } 
 
    void printList(Node node) { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.right; 
        } 
    } 
   
    public static void main(String[] args)  { 
        Binary_Tree_Problem2 tree = new Binary_Tree_Problem2(); 
        tree.root = new Node(10); 
        tree.root.left = new Node(12); 
        tree.root.right = new Node(15); 
        tree.root.left.left = new Node(25); 
        tree.root.left.right = new Node(30); 
        tree.root.right.left = new Node(36); 
   
        tree.BinaryTree2DoubleLinkedList(tree.root); 
           
        tree.printList(tree.head); 
   
    } 
} 