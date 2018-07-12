import java.util.Stack;

/*
Input:
2
3
3 2 1
5
11 2 32 3 41

Output:
3 2 1
41 32 11 3 2
 */
public class SortStack {
	public static Stack<Integer> sortStack(Stack<Integer> input) {
		Stack<Integer> tempStack = new Stack<>();
		while(!input.isEmpty()) {
			int temp = input.pop();
			while(!tempStack.isEmpty() && tempStack.peek() >= temp) {
				input.push(tempStack.pop());
			}
			tempStack.push(temp);
		}
		return tempStack;
	}
	
	public static void main(String args[])
    {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
     
        // This is the temporary stack
        Stack<Integer> tmpStack=sortStack(input);
        System.out.println("Sorted numbers are:");
     
        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+" ");
        } 
    }
}
