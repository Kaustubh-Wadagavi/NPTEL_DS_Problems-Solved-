import java.util.ArrayDeque;

public class QueuesWithDeques
{
    public static void main(String[] args) 
	{
		//Created array deque wich stores the queue elements
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

        //Pushes integers into the queue
        queue.add(0);
        queue.add(1);
        queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);

        //Find the top element from the queue
        System.out.println("Current element at the top of the queue: " + queue.peek());

        //Removes one integer from the queue
        System.out.println("Element removed from the queue: " + queue.poll());

        //Iterates into the queue
        System.out.print("Current elements in the queues are: ");
        while(!queue.isEmpty()) 
		{
            System.out.print(queue.poll() + " ");
        }

    }
}