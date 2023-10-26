
public class Q1Tester {

	public static void main(String[] args) {

		System.out.println("== OP(char) test case 1 ==");
		getOpChar_ReturnNotNull ();
		
		System.out.println("\n== OP(char) test case 2 ==");
		getOpChar_ReturnNull ();
		
		System.out.println("\n== OP(String) test case 1 ==");
		getOpString_ReturnNotNull ();
		
		System.out.println("\n== OP(String) test case 2 ==");
		getOpString_ReturnNull ();
		
		System.out.println("\n== Symbol test case 1 ==");
		getSymbol_ReturnNotNull ();
		
		System.out.println("\n== Symbol test case 2 ==");
		getSymbol_ReturnNull ();
		
		System.out.println("\n== Keyword test case 1 ==");
		getKeyword_ReturnNotNull ();
		
		System.out.println("\n== Keyword test case 2 ==");
		getKeyword_ReturnNull ();
		
		System.out.println("\n== Klingon test case 1 ==");
		getKlingon_ReturnNotNull ();
		
		System.out.println("\n== Klingon test case 2 ==");
		getKlingon_ReturnNull ();
		
		System.out.println("\n== Letter test case 1 ==");
		isLetter_ReturnTrue ();
		
		System.out.println("\n== Letter test case 2 ==");
		isLetter_ReturnFalse ();
		
		System.out.println("\n== Digit test case 1 ==");
		isDigit_ReturnTrue ();
		
		System.out.println("\n== Digit test case 2 ==");
		isDigit_ReturnFalse ();
		
		System.out.println("\n== White space test case 1 ==");
		isWhiteSpace_ReturnTrue ();
		
		System.out.println("\n== White space test case 2 ==");
		isWhiteSpace_ReturnFalse ();

		System.out.println("\n== Line break test case 1 ==");
		isLineBreak_ReturnTrue ();
		
		System.out.println("\n== Line break test case 2 ==");
		isLineBreak_ReturnFalse ();
		
		
		
	}
	
	/**
	 * This method tests if getOp is not null
	 */
	
	public static void getOpChar_ReturnNotNull () {
		
		TokenType a = Q1.getOp('+');
		System.out.println(a);
		System.out.println("Expect: " + TokenType.OP_ADD);
		
	

	}
	
	/**
	 * This method tests if getOp is null
	 */
	
	public static void getOpChar_ReturnNull () {
		
		TokenType t = Q1.getOp('a');
		System.out.println(t);
		System.out.println("Expect: " + null);
		
	}

	/**
	 * This method tests if getOpString is not null
	 */

	public static void getOpString_ReturnNotNull () {
	
		TokenType a = Q1.getOp("==");
		System.out.println(a);
		System.out.println("Expect: " + TokenType.OP_EQUAL);
	
	}

	/**
	 * This method tests if getOpString is null
	 */

	public static void getOpString_ReturnNull () {
	
		TokenType t = Q1.getOp("fhd");
		System.out.println(t);
		System.out.println("Expect: " + null);
	
	
}
	
	/**
	 * This method tests if getSymbol is not null
	 */	
	
	public static void getSymbol_ReturnNotNull () {
		
		TokenType a = Q1.getSymbol('(');
		System.out.println(a);
		System.out.println("Expect: " + TokenType.LEFT_PAREN);
		
	
	}

	/**
	 * This method tests if getSymbol is null
	 */
	
	public static void getSymbol_ReturnNull () {
		
		TokenType a = Q1.getSymbol('a');
		System.out.println(a);
		System.out.println("Expect: " + null);
		
	}

	/**
	 * This method tests if getKeyword is not null
	 */
	
	public static void getKeyword_ReturnNotNull () {
		
		TokenType a = Q1.getKeyword("if");
		System.out.println(a);
		System.out.println("Expect: " + TokenType.KEYWORD_IF);
		
	
	}

	/**
	 * This method tests if getKeyword is null
	 */
	
		public static void getKeyword_ReturnNull () {
			
			TokenType a = Q1.getKeyword("abc");
			System.out.println(a);
			System.out.println("Expect: " + null);
			
	}

		/**
		 * This method tests if getKlingon is not null
		 */
		
		
		public static void getKlingon_ReturnNotNull () {
			
			TokenType a = Q1.getKlingon("rItlh");
			System.out.println(a);
			System.out.println("Expect: " + TokenType.KLINGON_PRINT);
			
			
		}

		/**
		 * This method tests if getKlingon is null
		 */
		
		public static void getKlingon_ReturnNull () {
			
			TokenType a = Q1.getKlingon("acbdf");
			System.out.println(a);
			System.out.println("Expect: " + null);
			
		}

		/**
		 * This method tests if isLetter is true
		 */
		
		public static void isLetter_ReturnTrue () {
			
			Boolean a = Q1.isLetter('a');
			System.out.println(a);
			System.out.println("Expect: " + true);
			
		}

		/**
		 * This method tests if isLetter is false
		 */
		
		public static void isLetter_ReturnFalse () {
			
			Boolean a = Q1.isLetter('1');
			System.out.println(a);
			System.out.println("Expect: " + false);
			
		}

		/**
		 * This method tests if isDigit is true
		 */
		
		public static void isDigit_ReturnTrue () {
			
			Boolean a = Q1.isDigit('1');
			System.out.println(a);
			System.out.println("Expect: " + true);
			
		}

		/**
		 * This method tests if isDigit is false
		 */
		
		public static void isDigit_ReturnFalse () {
			
			Boolean a = Q1.isDigit('a');
			System.out.println(a);
			System.out.println("Expect: " + false);
			
		}

		/**
		 * This method tests if isWhiteSpace is true
		 */
		
		public static void isWhiteSpace_ReturnTrue () {
			
			Boolean a = Q1.isWhiteSpace(' ');
			System.out.println(a);
			System.out.println("Expect: " + true);
			
		}

		/**
		 * This method tests if isWhiteSpace is false
		 */
		
		public static void isWhiteSpace_ReturnFalse () {
			
			Boolean a = Q1.isWhiteSpace('a');
			System.out.println(a);
			System.out.println("Expect: " + false);
			
		}

		/**
		 * This method tests if isLineBreak is true
		 */
		
		public static void isLineBreak_ReturnTrue () {
			
			Boolean a = Q1.isLineBreak('\n');
			System.out.println(a);
			System.out.println("Expect: " + true);
			
		}

		/**
		 * This method tests if isLineBreak is false
		 */
		
		public static void isLineBreak_ReturnFalse () {
			
			Boolean a = Q1.isLineBreak('a');
			System.out.println(a);
			System.out.println("Expect: " + false);
			
		}
}
