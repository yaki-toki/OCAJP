
public class Q13 {
	
	public static void main(String[] args) {
		
		//boolean opt = true;
		// Which modification enables the code fragment to print TrueDone?
		/**
		 * A. Replace line 5 With String opt = "true";
		      Replace line 7 with case "true":
		 * B. Replace line 5 with boolean opt = l;
		      Replace line 7 with case 1:
		 * C. At line 9(break;), remove the break statement.
		 * D. Remove the default section.
		 * */
		String opt = "true";
		
		switch(opt) {
		case "true":
			System.out.print("True");
			break;
		default:
			System.out.print("****");
		}
		System.out.println("Done");
		
		// Answer : A
	}
}
