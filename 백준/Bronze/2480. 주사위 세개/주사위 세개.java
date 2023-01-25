import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if(a!=b && a!=c && b!=c) { // 만약 모든 변수가 다 다를 경우
			int max = Math.max(a, Math.max(b, c));
			System.out.println(max*100);
		}else if(a==b && b==c){ // 모든 변수가 다 같을 경우
			System.out.println(10000 + a*1000);
		}else if(a==b || a==c) { // a가 b 혹은 c와 같을 경우
			System.out.println(1000 + a*100);
		}else { // b가 c와 같을 경우
			System.out.println(1000 + b*100);
		}
	}
}