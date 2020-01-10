package main.geeksforgeeks.tree.binaryTree;

public class RightViewBinaryTreeRecursive{

    static class Node{
        int data;
        Node left, right;

        public Node(int item){
            this.data = item;
            left = right = null;
        }
    }

    void rightView(Node node){
        rightViewUtil(node,1);
    }

    void rightViewUtil(Node node, int level){

        //base:
        if(node == null){
            return;
        }

        // condition
        if(maxlevel<level){
            System.out.println(node.data);
            maxlevel = level;
        }

        rightViewUtil(node.right, level +1);
        rightViewUtil(node.left, level+1);

    }

    Node root;
    static int maxlevel;

    public static void main(String[] args) {
        
        RightViewBinaryTreeRecursive tree = new RightViewBinaryTreeRecursive();
        tree.root = new Node(33);

        tree.root.left = new Node(10); 
        tree.root.right = new Node(30); 
        tree.root.right.left = new Node(25); 
        tree.root.right.right = new Node(40); 

        tree.rightView(tree.root);

    }
}