import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();
		System.out.println(s.charAt(Integer.parseInt(bf.readLine())-1));
	}
	
}