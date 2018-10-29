package CISC181.Week8.iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		for (int i = 0; i < 10; i++)
			al.add(i);

		System.out.println(al);

		// at beginning itr(cursor) will point to
		// index just before the first element in al
		Iterator itr = al.iterator();

		// checking the next element availabilty
		while (itr.hasNext()) {
			// moving cursor to next element
			int i = (Integer) itr.next();

			// getting even elements one by one
			System.out.print(i + " ");

			// Removing odd elements
			if (i % 2 != 0)
				// YOU CAN'T DO THIS WITH ENUMERATION!!!
				itr.remove();
		}
		System.out.println();
		System.out.println(al);
	}
}