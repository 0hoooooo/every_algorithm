import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CaseAplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 각 테스트 케이스 결과 출력 변수 선언
        StringBuilder sb = new StringBuilder();
        // 입력받을 테스트 케이스 개수 T
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            sb.append("Case #").append(i).append(": ")
			.append(Integer.parseInt(st.nextToken())
			+Integer.parseInt(st.nextToken())).append('\n');
        }
        System.out.println(sb);
    }
}
