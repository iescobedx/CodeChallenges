// Israel Escobedo, Code Challenge 03-14-2022

// Imports package for exception handling.
import java.util.EmptyStackException;

public class CodeChallenge03142022{
    
    // Main method
    public static void main(String[] args){
       
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Part 1
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        // Creates linked list.
        LinkedList list = new LinkedList();

        // Adds nodes to linked lists.
        list.top1 = new Node(3);
        list.top1.next = new Node(7);
        list.top1.next.next = new Node(2);
        list.top1.next.next.next = new Node(8);
        list.top1.next.next.next.next = new Node(10);

        list.top2 = new Node(99);
        list.top2.next = new Node(1);
        list.top2.next.next = new Node(5);
        list.top2.next.next.next = new Node(8);
        list.top2.next.next.next.next= new Node(10);

        // Determines the intersecting node's integer value with display message; if none is found it displays the appropriate message.
        if(list.getIntersectionVal() == 0){
            System.out.println("\nNo intersecting node. Assuming linked lists have no node with a value of zero.");
            System.out.println("\n");

        }else{
            System.out.println("\nThe value of intersecting node: " + list.getIntersectionVal());
            System.out.println("\n");
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Part 2
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Creates 2 linked list versions of the stack.
        NodeStack stackA = new NodeStack();
        NodeStack stackB = new NodeStack();

        // Array of integer values for the stacks.
        int[] arrayA = {1, 15, 26, 7, 8, 12, 3, 19, 4};
        int[] arrayB = {-3, 9, -4, -1, 8, -7, 2, 5, 6};

        // Adds the integer values to each stack.
        for(int valA : arrayA){
            stackA.push(valA);
        }

        for(int valB : arrayB){
            stackB.push(valB);
        }

        // Try Catch statement for the EmptyStackException.
        try{

            // Displays a list of integer values & the maximum integer value for both stacks.
            // Displays the integer value that was removed from the stack & re-displays the list of integer values after the removal for both stacks.
            System.out.println("Stack A List");
            stackA.display();
            System.out.println("\nStack A Maximum Value: " + stackA.max());
            System.out.println("\nStack A Pop Value: " + stackA.pop());
            System.out.println("\nStack A List After Pop: ");
            stackA.display();

            System.out.println("\nStack B List");
            stackB.display();
            System.out.println("\nStack B Maximum Value: " + stackB.max());
            System.out.println("\nStack B Pop Value: " + stackB.pop());
            System.out.println("\nStack B List After Pop: ");
            stackB.display();

            System.out.println("\n");
        }
        catch (EmptyStackException e){

            // If the stack is null the EmptyStackException is catched & displays a message telling the user the stack is empty.
            System.out.println("Stack is empty.");

        }
    }
}