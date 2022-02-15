import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B7482 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a;i++) {
			double b = Double.parseDouble(bf.readLine());
			sb.append(String.format("%.10f\n", b/6));
		}
		System.out.println(sb);
	}
	
}