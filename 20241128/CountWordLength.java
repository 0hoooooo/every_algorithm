import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWordLength {
     public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 라인에 문자를 받기
        String str = br.readLine();

        // 배열 크기 출력
        System.out.print(str.length());

        br.close();

    }
}
