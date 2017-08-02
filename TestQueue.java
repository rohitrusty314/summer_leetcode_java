import java.util.*;

class TestQueue{
	public static void main(String[] args){
		System.out.println("Welcome to a queue demo!");
		Queue q = new Queue();

		while(true) {
			
			System.out.println("Select one of the following:");
			System.out.println("1. To add an element to the queue");
			System.out.println("2. To pop an element from the queue");
			System.out.println("3. To show the queue");
			System.out.println("4. To Exit");

			Scanner in = new Scanner(System.in);
			int choice = in.nextInt();
			int el;
			switch(choice) {
				case 1: System.out.print("Enter the element to be added to the queue: ");
						el = in.nextInt();
						q.push(el);
						break;
				case 2: if(q.isEmpty()) {
						System.out.println("The queue is empty. Nothing to pop.");
						break;
						}
						System.out.print("The element popped from the queue: ");
						el = q.pop();
						System.out.println(el);
						break;
				case 3: if(!q.isEmpty()) q.showQueue();
						else System.out.println("The Queue is empty");
						break;
				case 4: System.out.println("Bye, bye!");
						break;
				default: System.out.println("Invalid Choice.\nChoose again.");
						 break;
			}

			if(choice == 4) break;
		}
	}
}

class Queue{
	private List<Integer> queue;

	Queue(){
		queue = new ArrayList<Integer>();
	}

	public void push(int element) {
		queue.add(element);
	}

	public int pop() {
		int element = queue.get(0);
		queue.remove(0);
		return element;
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public void showQueue() {
		System.out.println("Queue. . .");
		for(int i=0; i<queue.size(); i++) {
			System.out.println(queue.get(i));
		}
	}

}