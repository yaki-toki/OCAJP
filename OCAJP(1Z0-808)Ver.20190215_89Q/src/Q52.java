
public class Q52 {
	private char var;
	public static void main(String[] args) {
		
		// What is the result?
		/**
		 * A. a, e
		      i, o
		      
		 * B. a, e
		      o, o
		      
		 * C. e, e
		      i, o
		      
		 * D. e, e
		      o, o
		 */
		
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
		
		Q52 obj1 = new Q52();
		Q52 obj2 = obj1;
		obj1.var = 'i';
		obj2.var = 'o';
		
		System.out.println(var1 + ", " + var2);
		System.out.println(obj1.var + ", " + obj2.var);
		
		// Answer : B
	}
}
