
public class Q12 {

	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}
	
	void checkCard(int cardNo) throws RuntimeException{	// line n1
		System.out.println("Checking Card");
	}
	
	public static void main(String[] args) {
		Q12 ex = new Q12();
		int cardNo = 12344;
		ex.checkCard(cardNo);							// line n2
		//ex.readCard(cardNo);							// line n3
		// Compilation fails only at line n3.
	}

}
