import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet {
    public static void main(String[] args) throws IOException {
        // 문자입력받을 인터페이스 선언 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자 출력할 인터페이스 선언
        StringBuilder sb = new StringBuilder();
        // 문자열 입력
        String s = br.readLine();
        // a 부터 z까지 for 문
        for (char c = 'a' ; c <= 'z' ; c++)
            sb.append(s.indexOf(c) + " ");
        System.out.println(sb);

    }
}
