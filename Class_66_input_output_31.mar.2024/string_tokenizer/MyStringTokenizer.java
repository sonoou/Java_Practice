import java.io.*;
import java.util.*;

class MyStringTokenizer{
	public static void main(String args[]){
		String s = "country = india;capital = delhi;country = japan;capital = tokyo;";
		StringTokenizer st = new StringTokenizer(s,";");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
