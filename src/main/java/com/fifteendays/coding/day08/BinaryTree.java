package com.fifteendays.coding.day08;

public class BinaryTree {

    //8, 7, 12, 15, 2, 5
    Node root;

    public Node insert(Node node, int value) {
        if (node == null) {
            root = new Node(value);
        } else if(value < root.value){
            root.left = insert(root.left, value);
        } else if( value > root.value){
            root.right = insert(root.right, value);
        }
        return root;
    }

    public boolean isSymmetric(Node n1, Node n2) {
        return (n1.value == n2.value) && isSymmetric(n1.left, n2.right) && isSymmetric(n1.right, n2.left);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node();
        Node n1 = tree.insert(root, 8);
        Node n2 = tree.insert(n1, 7);
        Node n3 = tree.insert(n2, 12);
        Node n4 = tree.insert(n3, 15);
        Node n5 = tree.insert(n4, 2);
        Node n6 = tree.insert(n5, 5);

        System.out.println(tree.isSymmetric(tree.root, tree.root));



    }
}
