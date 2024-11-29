import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringStartEnd {
    public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력 받을 문자열 개수 입력
		int n = Integer.parseInt(br.readLine());
		// String 형태 배열 배수 선언
		String name[] = new String[n];
		// 문자열 개수 for 문
		for(int i = 0 ; i < n; i++){
			// 문자열 입력
			String str = br.readLine();
			// 배열에 문자열의 첫글자와 마지막 글자 삽입
			name[i] = str.substring(0,1) + str.substring(str.length() -1, str.length());
		}
		br.close();

		for(int i = 0 ; i < n; i++){
			System.out.println(name[i]);
		}
	}
}
