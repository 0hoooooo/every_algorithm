import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringRepeat {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String과 문자열을 더할 때 StringBuilder를 쓴다
        StringBuilder sb = new StringBuilder(); 
        // 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine()); 
 
        for (int i = 0; i < T; i++) {
 
            StringTokenizer st = new StringTokenizer(br.readLine());  // 띄어쓰기를 기준으로 문자열을 분리함
            // 반복 횟수
            int R = Integer.parseInt(st.nextToken()); 
            // 반복할 문자
            String S = st.nextToken(); 
 
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    // String.charAt(n) = n번 째 위치의 문자를 char 형태로 반환
                    // append = 문자열을 더하는 역할
                    sb.append(S.charAt(j));
                    
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }    
}
