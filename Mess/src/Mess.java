/* 1. In the Mess.java file, we have declared a bunch of 
 * variables with the wrong type. Try to compile the file 
 * using the command: javac Mess.java
 * 
 * 2. Change the types of the variables so that they correspond 
 * with the type of the assignment values. 
 * For example, year is assigned 2001, so it should be an int.
 * 
 * 3. Compile the file again. Look at how it compiles with no errors now!
 */


// OLD CODE //
/*
 * 
public class Mess {
	public static void main(String[] args) {   
		String year = 2001;
    	double title = "Shrek";
    	int genre = 'C';
    	boolean runtime = 1.58;
    	char isPG = true;
	}
}
*
*/

// NEW CODE //
public class Mess {
	public static void main(String[] args) {   
		int year = 2001;
	    String title = "Shrek";
	    char genre = 'C';
	    double runtime = 1.58;
	    boolean isPG = true;
	    
	    System.out.println("== ALL ABOUT THE MOVE SHREK! == ");
	    System.out.println("\tYear: " + year);
	    System.out.println("\tTitle: " + title);
	    System.out.println("\tGenre: " + genre);
	    System.out.println("\tRuntime: " + runtime);
	    System.out.println("\tIs it PG?: " + isPG);
	}
}