package geeksforgeeks.tree.binaryTree;

/**
 * https://www.geeksforgeeks.org/print-left-view-binary-tree/
 * 
 * The trick in leftview is: the variable: maxlevel & left traversal..
 * 
 * as we go from root to below, we are basically going from one level to the next level.
 * 
 * we maintain this maxlevel variable.. so that, when we encounter the next level, we do know that maxlevel is less than current level.
 * so, we immediately print the data of the current node.
 * 
 * once we print, we then update maxlevel to current level.
 * then , we just do a left traversal first and then right traversal.
 * 
 * the idea can be applied for right view also.
 * so , there, we will do a right traversal first and then left traversal..
 * 
 */
public class LeftViewBinaryTreeRecursive{


    // type to depict a node
    static class Node{
        // fields
        int data;
        Node left, right;

        // constructor
        public Node(int item){
            data = item;
            left = right = null;
        }


    }

    

        // fields: root, maxlevel ( static )

        Node root;
        static int maxlevel = 0;


        void leftView(Node node){
            leftViewUtil(node,1);

        }

        void leftViewUtil(Node node, int level){

            // base case:
            if(node == null){
                return;
            }

            // else, check level & maxlevel
            if(maxlevel < level){
                System.out.println(node.data);
                maxlevel = level;
            }

            leftViewUtil(node.left, level+1);
            leftViewUtil(node.right, level+1);
        }

        void setRoot(Node node){
            this.root = node;
        }

        Node getRoot(){
            return root;
        }


    

    public static void main(String[] args) {
        
        LeftViewBinaryTreeRecursive tree = new LeftViewBinaryTreeRecursive();
        tree.setRoot(new Node(12)); // root node.

        
        tree.root.left = new Node(10); 
        tree.root.right = new Node(30); 
        tree.root.right.left = new Node(25); 
        tree.root.right.right = new Node(40); 

        tree.leftView(tree.getRoot());



    }

}