/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main 
{
    public static void main(String[] args) {
        
        //creating nodes
        Node root = new Node(8);
        Node node1 = new Node(4);
        Node node2 = new Node(12);
        Node node3 = new Node(2);
        Node node4 = new Node(6);
        Node node5 = new Node(10);
        Node node6 = new Node(14);


        //connecting nodes
        root.left =  node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        
        
        System.out.println("Nodes are Connected");
        
        System.out.println("Pre-Order Travers");
        Main.preOrder(root);
        
        System.out.println();
        
        System.out.println("In-Order Travers");
        Main.inOrder(root);
        
         System.out.println();

         System.out.println("Post-Order Travers");
         Main.postOrder(root);
    }
    
    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    
    public static void inOrder(Node root){
         if(root == null) return;
         inOrder(root.left);
         System.out.print(root.data + " ");
         inOrder(root.right);
    }
    
        public static void postOrder(Node root){
         if(root == null) return;
         postOrder(root.left);
         postOrder(root.right);
         System.out.print(root.data + " ");
    }
    
}
