// Israel Escobedo, Code Challenge 03-14-2022

// Class creates a node.
public class Node{

    int value;  // Variable stores integer value.
    Node next;  // Node

    // Node constructors.          
    Node(int val, Node n){
        value =val;
        next = n;
    }

    Node(int val){
        value = val;
        next = null;
    }
}