package javacomplexcollections;

import java.util.*;

public class JCF_UsingLists {

	public static void main(String[] args) {
		// create the list of books
		List<Book> list = new ArrayList<Book>();

		// Creating Books
		Book b1 = new Book(101, "Programming using C Language", "J.C.Maxwell", "Aspen Publishing");
		Book b2 = new Book(102, "Programming using C# Language", "M.Thiel", "Top Books Publishing");
		Book b3 = new Book(103, "Data Structures Fundamentals", "Sean Arnold", "Success Point");
		Book b4 = new Book(104, "Practical Node.js", "S.L Stephen", "Aspen Publishing");

		// Add the books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);

		// Traversing list
		for(Book b:list) {
			System.out.println(b.id+b.name+b.publisher+b.author);

		}
		// Traversing list with iterator
		ListIterator <Book> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println("The Book ID is :" + itr.next().id);
		}

	}

}
