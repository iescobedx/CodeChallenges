// Israel Escobedo Code Challenge Week 03-07-2022
public class CodeChallenge03072022 {
    
    // Display a list of strings based on a fibonacci sequence. 
    public static void main(String[] args){

        // String array.
        String[] arr = {"a0", "a1", "a2", "a3","a4","a5","a6","a7","a8","a9","a10","a11","a12", "a13"};

        // Variable to end the for loop.
        int n = 7;

        // Program statement.
        System.out.println("Fibonacci Sequence ending at 13.\n");

        // Displays the fibonacci numbers, categorized based on even or odd, & displays its' corresponding string based on the fibonacci number's position in the array.
        for(int val = 0; val <= n; val++){

            int fibNum = (fibMethod(val));

            if(fibNum == 0){

                System.out.println("Zero is not even or odd.\n");

            }else if(fibNum%2 == 0){

                System.out.println("Even Number: " + fibNum + "\nString Value: " + arr[fibNum] + "\n");
               
            }else{

                System.out.println("Odd Number: " + fibNum + "\nString Value: " + arr[fibNum] + "\n");

            }
        }
    }

    // Method that genrates a fibonacci number sequence.
    public static int fibMethod(int num){
        if(num==0){
            return 0;
        }else if (num==1){
            return 1;
        }else{
            return fibMethod(num-1) + fibMethod(num-2);
        }
    }
}
