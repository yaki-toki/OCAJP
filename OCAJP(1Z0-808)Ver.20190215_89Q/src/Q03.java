
public class Q03 {

	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. Sum is 600
		 * B. Compilation fails at line n1.
		 * C. Compilation fails at line n2.
		 * D. A ClassCastException is thrown at line n1.
		 * E. A ClassCastException is thrown at line n2.
		 */
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2;				// line n1
		//String s4 = (String) (s3 * s2);		// line n2
		//System.out.println("Sum is " + s4);
		
		// Answer : C 
	}

}
