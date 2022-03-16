// Israel Escobedo, Code Challenge 03-14-2022

// Imports package for exception handling.
import java.util.EmptyStackException;

// Class creates a linked list varsion of a stack & contains related methods.
public class NodeStack{

    // Declares the first node of the stack.
    Node top = null;

    // Method returns trues if the stack is empty.
    public boolean empty(){
        return top==null;
    }

    // Method returns the top node value of the stack.
    public int peek(){
        return top.value;
    }

    // Method adds a node with an integer value to the stack.
    public void push(int numA){
       top = new Node(numA, top);
    }

    // Method removes the top node of the stack & returns its' integer value.
    public int pop(){
        
        // If stack is empty an EmptyStackException is thrown else it removes the top node & returns its' integer value.
        if(empty()){
            throw new EmptyStackException();
        }else{
            int popVal = top.value;
            top = top.next;
            return popVal;
        }
    }

    // Method return the maximum integer value of the stack.
    public int max(){
        
        int maxVal = 0; // Variable holds the maximum value.

        Node temp = top; // Creates dummy node.

        // If stack is empty an EmptyStackException is thrown else it will iterate through the stack to find the maximum integer value & returns it.
        if(empty()){
            throw new EmptyStackException();
        } else {
            while(temp != null){

                if(maxVal < temp.value){
                    maxVal = temp.value;
                } else {
                    temp = temp.next;
                }
            }         
            return maxVal;
        }
    }

    // Method displays the list of integer values of the stack.
    public void display(){

        Node temp = top;  // Creates dummy node.

        // If stack is empty an EmptyStackException is thrown else it will iterate through the stack to display the integer values of the stack.
        if(empty()){
            throw new EmptyStackException();
        }else{
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }
}