package stacks;

import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int arr[] = {7, 2, 1, 0, 6, 5, 3, 8, 2};
        Stack<Integer> s = new Stack<>();
        int nxtGreater [] = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--){
            // 1. while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            // 2. if-else
            if (s.isEmpty()){
                nxtGreater[i] = -1;      // there is no next greater element
            } else {
                nxtGreater[i] = arr[s.peek()];
            }
            // 3. push in s
            s.push(i);
        }
        for (int i = 0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}
        /* variations of the problem
         1. Next greater element to the left :-
               for(int i = 0; i<=arr.length-1; i++) only change the first for loop
                rest of the code remains same
          2.  Next smaller element to the rigth :-
                only the condition in the while loop changes
                while (!s.isEmpty() && arr[s.peek()] >= arr[i])
          3. Next smaller element to the left :-
                the for loop and the while loop changes
                for(int i = 0; i<=arr.length-1; i++)
                while (!s.isEmpty() && arr[s.peek()] >= arr[i])
        */
