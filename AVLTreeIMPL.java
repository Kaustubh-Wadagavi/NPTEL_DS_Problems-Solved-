/*
 * Java Program to Implement and AVL Tree.
 */
 
 /*
 An AVL tree is a self-balancing binary search tree.
 */

import java.util.Scanner;

class AVLNode {
    AVLNode left, right;
    int data;
    int height;

    public AVLNode() {
        left = null;
        right = null;
        data = 0;
        height = 0;
    }

    public AVLNode(int n) {
        left = null;
        right = null;
        data = n;
        height = 0;
    }
}

class AVLTree {
    private AVLNode root;

    public AVLTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void makeEmpty() {
        root = null;
    }

    public void insert(int data) {
        root = insert(data, root);
    }

    private int height(AVLNode t) {
        return t == null ? -1 : t.height;
    }

    private int max(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;
    }

    private AVLNode insert(int X, AVLNode t) {
        if(t == null) {
            t = new AVLNode(X);
        } else if(X < t.data) {
            t.left = insert(X, t.left);
            if(height(t.left) - height(t.right) == 2) {
                if(X < t.left.data) {
                    t = rotateWithLeftChild(t);
                } else {
                    t = doubleWithLeftChild(t);
                }
            } 
        } else if(X > t.data) {
            t.right = insert( X, t.right );
            if( height( t.right ) - height( t.left ) == 2 ) {
                if( X > t.right.data) {
                    t = rotateWithRightChild( t );
                } else {
                    t = doubleWithRightChild( t );
                }
            }
        } else {
            t.height = max( height( t.left ), height( t.right ) ) + 1;
        }
        return t;
    }
        
    private AVLNode rotateWithLeftChild(AVLNode k2) {
        AVLNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = max( height( k2.left ), height( k2.right ) ) + 1;
        k1.height = max( height( k1.left ), k2.height ) + 1;
        return k1;
    }

    private AVLNode rotateWithRightChild(AVLNode k1) {
        AVLNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = max( height( k1.left ), height( k1.right ) ) + 1;
        k2.height = max( height( k2.right ), k1.height ) + 1;
        return k2;            
    }

    private AVLNode doubleWithLeftChild(AVLNode k3) {
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);
    }

    private AVLNode doubleWithRightChild(AVLNode k1) {
        k1.right = rotateWithLeftChild(k1);
        return rotateWithRightChild( k1 );
    }
    
    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(AVLNode r) {
        if(r == null) {
            return 0;
        } else {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }

    public boolean search(int val) {
        return search(root, val);
    }

    private boolean search(AVLNode r, int val) {
        boolean found = false;

        if((r != null) && !found) {
            int rval = r.data;

            if(val < rval) {
                r = r.left;
            } else if(val > rval) {
                r = r.right;
            } else {
                found = true;
            }
            found = search(r,val);
        }
        return found;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(AVLNode r) {
        
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data +" ");
            inorder(r.right);
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(AVLNode r) {
        
        if (r != null) {
            System.out.print(r.data +" ");
            preorder(r.left);             
            preorder(r.right);
        }   
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(AVLNode r) {
        
        if (r != null) {
            postorder(r.left);             
            postorder(r.right);
            System.out.print(r.data +" ");
        }
    }
}     

public class AVLTreeIMPL {

    public static void main(String Args[]) {
        Scanner scanner = new Scanner(System.in);

        AVLTree AVL_Tree = new AVLTree();

        System.out.println("************************ AVL TREE ************************\n");
        char ch;

        do {
            System.out.println("\nAVLTree Operations\n");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Count Nodes");
            System.out.println("4. Check Empty");
            System.out.println("5. Clear Tree");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 : 
                    System.out.println("Enter integer element to insert");
                    AVL_Tree.insert( scanner.nextInt() );                     
                    break;                          

                case 2 : 
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ AVL_Tree.search(scanner.nextInt()));
                    break;                                          

                case 3 : 
                    System.out.println("Nodes = "+ AVL_Tree.countNodes());
                    break;     
        
                case 4 : 
                    System.out.println("Empty status = "+ AVL_Tree.isEmpty());
                    break;     

                case 5 : 
                    System.out.println("\nTree Cleared");
                    AVL_Tree.makeEmpty();
                    break;         

                default : 
                    System.out.println("Wrong Entry \n ");
                    break;   

            }

            System.out.print("\nPost order : ");
            AVL_Tree.postorder();

            System.out.print("\nPre order : ");
            AVL_Tree.preorder();

            System.out.print("\nIn order : ");
            AVL_Tree.inorder();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scanner.next().charAt(0);

        } while(ch == 'Y' || ch == 'y');
    }
 
}
