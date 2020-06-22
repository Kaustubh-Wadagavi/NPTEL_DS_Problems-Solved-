import java.util.*;

public class StackWithDeques
{
	private Deque<Integer> data = new ArrayDeque<Integer>(); //Created Integer deque

	public void push(Integer element)
	{
		data.addFirst(element);  //Adding elements in Deque
	}
	public Integer pop()       //Removing First Element
	{
		return data.removeFirst();
	}
	public Integer peek() //getting First Element from the deque
	{
		return data.peekFirst();
	}
	public String toString()     //Getting data in the string to print all the data
	{
		return data.toString();
	}
	public static void main(String[] args)  //Main class
	{
		StackWithDeques stack = new StackWithDeques(); //Stack object
		for (int i = 0; i < 5; i++) 
		{
			stack.push(i);     //Pushing elements in stack
		}
		System.out.println("After pushing 5 elements: " + stack);

		int m = stack.pop();   //Poping first element
		System.out.println("Popped element = " + m);

		System.out.println("After popping 1 element : " + stack);

		int n = stack.peek();
		System.out.println("Peeked element = " + n);
		System.out.println("After peeking 1 element : " + stack);
	}
}