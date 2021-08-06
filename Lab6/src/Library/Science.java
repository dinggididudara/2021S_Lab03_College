package Library;

import java.io.Serializable;
import java.util.Scanner;

/**
 * {@summary reading title, year of book}
 * 
 *
 */
public class Science extends NonFiction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String title;
	String author;
	int year;
	
	@Override
	public void readBooks(Scanner sc) {
		System.out.println("Title:");
		title = sc.nextLine();
		System.out.println("Author:");
		author = sc.nextLine();
		System.out.print("Year: ");
		year = sc.nextInt();
	} //read end
	
	@Override
	void print() {
		super.print();
		System.out.printf("| %20s | %20s | %5s \n", title, author, year);
	} //print end
} //Science class end
