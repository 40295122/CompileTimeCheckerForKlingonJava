import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Q4 {

	public static void main(String[] args) {
		
		System.out.println("## Q4Example1:");
		String prog1 = readFile2String("src/Q4Example1.txt");
		scan(prog1);
		System.out.println("\n## Q4Example2:");
		String prog2 = readFile2String("src/Q4Example2.txt");
		scan(prog2);
		System.out.println("\n## Q4Example3:");
		String prog3 = readFile2String("src/Q4Example3.txt");
		scan(prog3);
		System.out.println("\n## Q4Example4:");
		String prog4 = readFile2String("src/Q4Example4.txt");
		scan(prog4);
		System.out.println("\n## Q4Example5:");
		String prog5 = readFile2String("src/Q4Example5.txt");
		scan(prog5);
	
	}
	
	/**
	 * This method returns the corresponding operator name for single character operators
	 * @param ch - Takes a parameter ch of type char
	 * @return op1 - Returns a value of type TokenType
	 */
	
	public static TokenType getOp(char ch) {
		
		TokenType op1 = null;
		
	if(ch == '+') {
		op1 = TokenType.OP_ADD;
				  
	
	}else if (ch == '-') {
		op1 = TokenType.OP_SUBTRACT;
						
	
	}else if (ch == '*') {
		op1 = TokenType.OP_MULTIPLY;
						
	
	}else if (ch == '/') {
		op1 = TokenType.OP_DIVIDE;
						
	
	}else if (ch == '%') {
		op1 = TokenType.OP_MOD;
						
	
	}else if (ch == '<') {
		op1 = TokenType.OP_LESS;
						
	
	}else if (ch == '>') {
		op1 = TokenType.OP_GREATER;
						
	
	}else if (ch == '=') {
		op1 = TokenType.OP_ASSIGN;
	
	}
		
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
 
	
	}else if (s.equals ("<=")) {
		op2 = TokenType.OP_LESSEQUAL;
	 
	
	}else if (s.equals (">=")) {
		op2 = TokenType.OP_GREATEREQUAL;
		 
	
	}else if (s.equals ("!=")) {
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
		
	if(ch == '(') {
		sym = TokenType.LEFT_PAREN;
		
	
	}else if(ch == ')') {
		 sym = TokenType.RIGHT_PAREN;
		
	
	}else if(ch == '{') {
		 sym = TokenType.LEFT_BRACE;
		
	
	}else if(ch == '}') {
		sym = TokenType.RIGHT_BRACE;
		
	
	}else if(ch == '[') {
		sym = TokenType.LEFT_BRACKET;
		
	
	}else if(ch == ']') { 
		sym = TokenType.RIGHT_BRACKET;
		
	
	}else if(ch == ';') {
		sym = TokenType.SEMICOLON;
		
	
	}else if(ch == ',') {
		sym = TokenType.COMMA;
	}
		return sym; 
	
	}
	
	/**
	 * This method returns the corresponding keyword name for string operators
	 * @param s - Takes a parameter s of type String
	 * @return keyword - Returns a value of type TokenType
	 */
	
	public static TokenType getKeyword(String s) {
		
		
		TokenType keyword;
	
		
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
		
	}else {
		
		keyword = null;
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
		
	if (ch == ' '  || ch == '\t' || ch =='\r') {
		
		return true;
	
		
	}else {
		
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
	/**
	 * This method reads a file and returns its contents as a String variable
	 * @param fname Name of file
	 * @return content of the file as a string
	 */
	
	public static String readFile2String (String fname) {
		
		String content = null;
		
		try {
			content = new String(Files.readAllBytes(Paths.get(fname)));
			
		} catch (IOException e) {
			System.out.println("Fail to read a file");
		}
		
		return content;
	}
	
	/**
	 * This method scans the Klingon Example file and identifies each character within the file
	 * @param prog Name of string
	 */
	
	public static void scan  (String prog) {
	
	
			int n = prog.length();
			int index = 0;
			int lineNumber = 1;

			while (index < n) {

				char ch = prog.charAt(index); 
				char ch_next = ' ';
				
				
				if (index < n - 1) ch_next = prog.charAt(index+1);
				
				boolean whiteSpace = isWhiteSpace(ch);
				
				boolean newline = isLineBreak(ch);
				
				TokenType sym = getSymbol(ch);
				TokenType op = getOp(ch);
				boolean letter = isLetter(ch);
				boolean digit = isDigit(ch);

			if (whiteSpace) {  
				
					index ++;
					continue;

			} else if (newline) {  
					
					lineNumber++;
					index ++;
					continue;
					
			} else if (ch == '/' && ch_next == '/') {
					
					index++;
					index++;
					
					ch = prog.charAt(index);
					
					while (ch != '\n') {
						index++;
						ch = prog.charAt(index);
					}
					
					continue;
					
			} else if (ch == '/' && ch_next == '*') {
					
					index++;
					index++;
					
					ch = prog.charAt(index);
					
					while (index < n) {
						if (ch == '*') {
							index++;
							ch = prog.charAt(index);
							if (ch == '/') {
								index++;
								break;
							}
							
						} else {
							index++;
							ch = prog.charAt(index);
						}
	
					}
					
					continue;
					
			} else if (isDigit(ch)) {
					int i = index;
					ch = prog.charAt(i);
					String number = "";
					number = number + ch;
					i ++;
					
						while (i < n) {
							ch = prog.charAt(i);
									if (isDigit(ch)) {
										number = number + ch;
										i ++;
									}
									else { break; }
					}
						if (isLetter(ch)) {
							System.out.println("Syntax error on token \"" + number + "\", delete this token\nat Line " + lineNumber);
						}

					index++;
					continue;
					
			} else if (ch == '\"') { 
						
						String str = "";
			
						index++;
						
						while (index < n) {
							ch = prog.charAt(index);
							if(ch == '\"') {
								str = str + ch;
								index++;
								break;
							} else {
								str = str + ch;
								index++;
							}
							
						}
							
						if (str.contains("\"")) {
						
						} else {
							System.out.println("String literal is not properly closed by a double-quote \nat Line " + lineNumber);
						}
						
						index++;
						return;
					
			} else if (ch == '{' || ch == '}') {
						
						int count = 0;
						int count2 = 0;
						int position = 0;
						int position2 = 0;
						int line = 1;
						int line2 = 1;
						char bracket;
						
						for (int i = 0; i<n; i++) {	
						ch = prog.charAt(i);
						
						
							if(ch == '{') {
								count++;
								position = index;
						 	
							} else if (ch == '}') {
								count2++;
								position2 = index;
								
							}
					
							for (int j = 0; j<position; j++) {
							ch = prog.charAt(j);
							if(isLineBreak(ch)) {
								line++;
							}
							}
							for (int j = 0; j<position2; j++) {
							ch = prog.charAt(j);
							if(isLineBreak(ch)) {
								line2++;
									}
								}
							}
					
							if ( count < count2 ) {
								bracket = '{';
								System.out.println("Syntax error, insert \"" + bracket + "\" to complete ClassBody \nat Line " + line);
								return;
							} else if (count > count2) {
								bracket = '}';
								System.out.println("Syntax error, insert \"" + bracket + "\" to complete ClassBody \nat Line "+ line2);
								return;
							}
							
							index++;
							continue;
				
			} else if (ch == 'i') {
						
						int temp = index;
						String str = "";
						
						while (index < n) {
							
							ch = prog.charAt(index);
							if (isLetter(ch)) {
								ch = prog.charAt(index);
								str = str + ch;
							} else if (ch == ' ') {
								break;}
								
							index++;
					}
	
					if (str.equals("int")) {
						index++;
						
						while(index<n) {
							
							index++;
							ch = prog.charAt(index);
							if(ch == '.') {
								System.out.println("Type mismatch: cannot convert from double to int \nat Line " +lineNumber);
								index++;
							} else if ( ch == ';'){ 
								break;
							} else { index++;}
						}
					}
					index = temp;
					index++;
					continue;
					
			} else if (ch == 's') {
						
						ch = prog.charAt(index);
						String word = "";
						word = word + ch;
						index ++;
						while (index < n) {  
							ch = prog.charAt(index);
							if (isLetter(ch)|| isDigit(ch)) {
								word = word + ch;
								index ++;
								
							}
							
							else  {break;}
							
						} 
					
					if (word.equals("static")) {

					String two = "";
					index++;
					while (index<n) {
						ch = prog.charAt(index);
						if(isLetter(ch)) {
							two= two +ch;
						} else { break;}
						index++;
					}

						TokenType keyword = getKeyword(two);
						if (keyword == null) {
						
							System.out.println("Return Type for the method is missing \nat line " + lineNumber);
							
						}
					}
					
					index++;
				 	continue;		
				
			} else if (sym != null) {  

					//System.out.println(lineNumber + ", " + sym + ", " + ch);
					index ++;
					continue;

			} else if (op != null || ch == '!') { 

					ch = prog.charAt(index);
					String twoOp = "";
					twoOp += ch;
					index++;
					char ch2 = prog.charAt(index);
					twoOp += ch2;

					if (getOp(twoOp) != null) {
						
						//System.out.println(lineNumber + ", " + operation2 + ", " + twoOp);
						index++;
						
					} else {
						
						//System.out.println(lineNumber + ", " + op + ", " + ch);
							
					}
					
						continue;

			} else if (letter) { 

					ch = prog.charAt(index);
					String word = "";
					word = word + ch;
					index ++;
					while (index < n) {  
						ch = prog.charAt(index);
						if (isLetter(ch)|| isDigit(ch)) {
							word = word + ch;
							index ++;
						}
						
						else  {break;}
						
					}
					
					TokenType klingon = getKlingon(word);
					TokenType keyword = getKeyword(word);
				
						if (klingon != null) {
							
							//System.out.println(lineNumber + ", " + klingon + ", " + word);
							
						} else if (keyword != null) {
							
							//System.out.println(lineNumber + ", " + keyword + ", " + word);
							
						} else {
							
							//System.out.println(lineNumber + ", " + "IDENTIFIER" + ", " + word);
						}
						
					continue;

			} else if (digit) { 

					ch = prog.charAt(index);
					String number = "";
					number = number + ch;
					index ++;
					while (index < n) {
						ch = prog.charAt(index);
								if (isDigit(ch)) {
									number = number + ch;
									index ++;
								}
								else { break; }
					}
					
					//System.out.println(lineNumber+ ", " + "INTEGER" + ", " + number);
					continue;

			} else if (ch == '\"') { 
					
					String str = "";
					ch = prog.charAt(index);
					str = str + ch;
		
					index++;
					
					while (index < n) {
						ch = prog.charAt(index);
						if(ch == '\"') {
							str = str + ch;
							index++;
							break;
						} else {
							str = str + ch;
							index++;
						}
						
					}
						
					//System.out.println(lineNumber + ", " + TokenType.STRING + ", " + str);
					continue;
					
			} else {
					
					//System.out.println("Encounter something not expected at index " + index + ch + lineNumber);
					index ++;
					continue;

				}

			}	
		}
	}