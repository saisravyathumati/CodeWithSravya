// LinkedList class is the predefined class in java.util package. Find the below operations which are existing with LinkedList.
// There are many more operations like size(), peek(), peekFirst(), peekLast() etc.

import java.util.LinkedList;
public class LinkedListClass {
	public static void main(String args[]) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("A");
		linkedList.addFirst("B");
		System.out.println(linkedList);
		linkedList.add("A");
		linkedList.addLast("C");
		System.out.println(linkedList);
		linkedList.removeFirst();
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
	}
}


/*
Output:
[B, A, A]
[B, A, A, A, C]
[A, A, A, C]
[A, A, A]
*/
