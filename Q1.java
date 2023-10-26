
public class Q1 {

	public static void main(String[] args) {
		
		
		TokenType op1 = getOp('+');
		System.out.println("op1: "+op1);
		
		TokenType op2 = getOp("==");
		System.out.println("op2: " + op2);
		
		TokenType sym = getSymbol('{');
		System.out.println("symbol: " + sym);
		
		TokenType keyword = getKeyword("int");
		System.out.println("keyword: " + keyword);
		
		TokenType klingon = getKlingon("rItlh");
		System.out.println("klingon: " + klingon);
		
		boolean letter = isLetter('a');
		System.out.println("letter: " + letter);
		
		boolean digit = isDigit('0');
		System.out.println("digit: " + digit);
		
		boolean whiteSpace = isWhiteSpace(' ');
		System.out.println("whiteSpace: " + whiteSpace);
		
		boolean newline = isLineBreak('\n');
		System.out.println("newline: " + newline);


	}
	
	/**
	 * This method returns the corresponding operator name for single character operators
	 * @param ch - Takes a parameter ch of type char
	 * @return op1 - Returns a value of type TokenType
	 */
	
	public static TokenType getOp(char ch) {
		
		TokenType op1 = null;
		
		if(ch == '+') 
			op1 = TokenType.OP_ADD;
				  
	
		else if (ch == '-') 
			op1 = TokenType.OP_SUBTRACT;
						
	
		else if (ch == '*') 
			op1 = TokenType.OP_MULTIPLY;
						
	
		else if (ch == '/') 
			op1 = TokenType.OP_DIVIDE;
						
	
		else if (ch == '%') 
			op1 = TokenType.OP_MOD;
						
	
		else if (ch == '<') 
			op1 = TokenType.OP_LESS;
						
	
		else if (ch == '>') 
			op1 = TokenType.OP_GREATER;
		
						
		else if (ch == '=') 
			op1 = TokenType.OP_ASSIGN;
						
	
		return op1;
	
		}
	
	/**
	 * This method returns the corresponding operator name for string operators
	 * @param s - Takes a parameter s of type String
	 * @return op2 - Returns a value of type TokenType
	 */
	
	public static TokenType getOp(String s) {
		
		TokenType op2 = null;
		
		if (s.equals ("==")) {
			op2 = TokenType.OP_EQUAL;
 
	
		} else if (s.equals ("<=")) {
			op2 = TokenType.OP_LESSEQUAL;
	 
	
		} else if (s.equals (">=")) {
			op2 = TokenType.OP_GREATEREQUAL;
		 
	
		} else if (s.equals ("!=")) {
			op2 = TokenType.OP_NOTEQUAL;
			
			
		}
		
		return op2; 
	
	}
	
	/**
	 * This method returns the corresponding symbol name for char operators
	 * @param ch - Takes a parameter ch of type char
	 * @return sym - Returns a value of type TokenType
	 */
	
	public static TokenType getSymbol(char ch) {
		
		TokenType sym = null;
		
		if(ch == '(') 
			sym = TokenType.LEFT_PAREN;
		
	
		else if(ch == ')') 
			sym = TokenType.RIGHT_PAREN;
		
	
		else if(ch == '{') 
			sym = TokenType.LEFT_BRACE;
		
	
		else if(ch == '}') 
			sym = TokenType.RIGHT_BRACE;
		
	
		else if(ch == '[') 
			sym = TokenType.LEFT_BRACKET;
		
	
		else if(ch == ']') 
			sym = TokenType.RIGHT_BRACKET;
		
	
		else if(ch == ';') 
			sym = TokenType.SEMICOLON;
		
	
		else if(ch == ',') 
			sym = TokenType.COMMA;
	
		return sym; 
	
	}
	
	/**
	 * This method returns the corresponding keyword name for string operators
	 * @param s - Takes a parameter s of type String
	 * @return keyword - Returns a value of type TokenType
	 */
	
	public static TokenType getKeyword(String s) {
		
		
		TokenType keyword = null;
	
		
	if(s.equals ("if")) {
		keyword = TokenType.KEYWORD_IF;
		
	
	}else if(s.equals ("else")) {
		keyword = TokenType.KEYWORD_ELSE;
		
		
	}else if(s.equals("int")) {
		keyword = TokenType.KEYWORD_INT;
		
	
	}else if(s.equals("String")) { 
		keyword = TokenType.KEYWORD_STRING;
		
	
	}else if(s.equals ("public")) {
		keyword = TokenType.KEYWORD_PUBLIC;
		
		
	}else if(s.equals ("class")) {
		keyword = TokenType.KEYWORD_CLASS;
		
	
	}else if(s.equals ("void")) {
		keyword = TokenType.KEYWORD_VOID;
		 
	
	}else if(s.equals ("static")) {
		keyword = TokenType.KEYWORD_STATIC;
		
	}
		return keyword;
		
		
	}
	
	/**
	 * This method returns the corresponding klingon name for string operators
	 * @param s - Takes a parameter s of type String
	 * @return klingon - Returns a value of type TokenType
	 */
	
	public static TokenType getKlingon(String s) {
	
		
		TokenType klingon = null;
		
		
		if(s.equals ("rItlh")) {
			klingon = TokenType.KLINGON_PRINT;
			
		
		} else if (s.equals ("boq")) {
			klingon = TokenType.KLINGON_ADD;
			
		
		} else if ( s.equals ("boqha")) {
			klingon = TokenType.KLINGON_SUBTRACT;
			
		
		}else if ( s.equals ("boqegh")) {
			klingon = TokenType.KLINGON_MULTIPLY;
			
		
		}else if ( s.equals ("boqHaegh")) {
			klingon = TokenType.KLINGON_DIVIDE;
			
		}
			return klingon;
		
		
	}
	
	/**
	 * This method returns the boolean to indicate whether the char input is part of the alphabet
	 * @param ch - Takes a parameter ch of type char
	 * @return letter - Returns a boolean of true or false
	 */		
	
	public static boolean isLetter(char ch) {
		
		if ( ch  == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'i' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'o' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 't' || ch == 's' || ch == 'u' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z' || ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'E' || ch == 'F' || ch == 'G' || ch == 'H' || ch == 'I' || ch == 'J' || ch == 'K' || ch == 'L' || ch == 'M' || ch == 'N' || ch == 'O' || ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'T' || ch == 'S' || ch == 'U' || ch == 'V' || ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') {
			
			return true;
			
		} else {
			
			return false;
			
				}
		
	}
	
	/**
	 * This method returns the boolean to indicate whether the char input is of the digits 0 to 9
	 * @param ch - Takes a parameter ch of type char
	 * @return digit - Returns a boolean of true or false
	 */	
	
	public static boolean isDigit(char ch) {
		
		if ( ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9') {
		
		return true;
		
		} else {

		return false;
		
			}
		
	}
	
	/**
	 * This method returns the boolean to indicate whether a white space is present
	 * @param ch - Takes a parameter ch of type char
	 * @return space - Returns a boolean of true or false
	 */	
	
	public static boolean isWhiteSpace(char ch) {
		
	if (ch == ' ') {
		
		return true;
		
	} else {
		
		return false;
		
			}
		
	}
	
	/**
	 * This method returns the boolean to indicate whether there is a line break
	 * @param ch - Takes a parameter ch of type char
	 * @return lineBreak - Returns a boolean of true or false
	 */	
	
	public static boolean isLineBreak(char ch) {
		
	if (ch =='\n') {
		
		return true;
		
	} else {
		
		return false;
		
			}
	
	}
	
}
	

	
	
	
	
	

