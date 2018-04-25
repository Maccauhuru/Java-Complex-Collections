package javacomplexcollections;

import java.util.HashSet;

public class JCF_Sets_HashSets {

	public static void main(String[] args) {
		HashSet <Book> set = new HashSet <Book>();
		
		// Creating Books
		Book b1 = new Book(101, "Programming using C Language", "J.C.Maxwell", "Aspen Publishing");
		Book b2 = new Book(102, "Programming using C# Language", "M.Thiel", "Top Books Publishing");
		Book b3 = new Book(103, "Data Structures Fundamentals", "Sean Arnold", "Success Point");
		Book b4 = new Book(104, "Practical Node.js", "S.L Stephen", "Aspen Publishing");
		
		// Adding books to the hashset
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		
		//Traversing Hashset
		for(Book  b: set) {
			System.out.println(b.id+", "+b.name+", "+b.publisher+", "+" "+b.author);
		
		}

	}

}
