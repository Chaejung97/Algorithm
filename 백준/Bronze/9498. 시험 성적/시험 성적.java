import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(br.readLine());
		
		if(90<=score && score<=100) System.out.println("A");
		else if(80<=score && score<90) System.out.println("B");
		else if(70<=score && score<80) System.out.println("C");
		else if(60<=score && score<70) System.out.println("D");
		else System.out.println("F");
	}
}