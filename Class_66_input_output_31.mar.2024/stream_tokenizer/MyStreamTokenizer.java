import java.io.*;

class MyStreamTokenizer{
	public static void main(String args[])throws IOException{
		FileInputStream fin = new FileInputStream("abc11.txt");
		InputStreamReader ir = new InputStreamReader(fin);
		StreamTokenizer st = new StreamTokenizer(ir);
		st.eolIsSignificant(true); // it consider the \n and increament the count
								   // eol = end of line. and used to know totat
								   // number of lines
		st.wordChars(33,255); // it means the token will contain only those characters
							  // that underlie between 33 and 255 ASCII range
		st.whitespaceChars(0,32); // used to give delimiter. it accepts ASCII value of
								// the character,and range is also acceptable.
		int token = 0;
		int count = 0;
		while(true){
			token = st.nextToken();
			//TT_EOF - Type of Token End Of File
			if(token == StreamTokenizer.TT_EOF){
				break;
			}
			//TT_NUMBER - Type Of Token number
			if(token == StreamTokenizer.TT_NUMBER){
				// nval -> number value, float type variable
				System.out.println(st.nval+" number");
			}
			//TT_WORD -> Type Of Token word
			if(token == StreamTokenizer.TT_WORD){
				System.out.println(st.sval+" word");
			}
			count++;
		}
		System.out.println("no of words in file "+count);
	}
}
