// Israel Escobedo, Code Challenge 03-14-2022

// Class creates a linked list & contains related methods.
public class LinkedList{

    // Declares the first nodes of 2 linked lists.
    Node top1, top2;

    // Method accepts the nodes of 2 linked lists to obtain the intersecting node & returns its' integer value.
    public int findIntersection(Node node1, Node node2){

        // Creates dummy nodes.
        Node ref1 = node1;
        Node ref2 = node2;

        // Iterates through both linked lists to obtain the intersecting node's integer value; if none is found it returns 0.
        while (ref1 != null && ref2 != null) {
            if (ref1.value == ref2.value) {
                return ref1.value;
            }
            ref1 = ref1.next;
            ref2 = ref2.next;
        }
        return 0;
    }

    // Returns the intersecting node's integer value or 0 if none is found.
    public int getIntersectionVal(){
        return findIntersection(top1, top2);
    }
}