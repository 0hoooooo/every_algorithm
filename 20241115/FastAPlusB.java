import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastAPlusB {
    public static void main(String[] args) throws IOException{
        //BufferedReader는 입력 스트림에서 문자열을 읽어오기 위한 클래스
        //InputStreamReader(System.in)은 표준 입력(System.in)을 문자열로 변환하는 InputStreamReader 객체를 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // 몇세트를 구할지 입력받기
        int N = Integer.parseInt(br.readLine());

        // for문
        for(int i = 0; i < N; i++){
            // BufferedReader 로 라인을 읽고
            // 그 라인에서 특정 문자열로 읽어드리기위해서는 StringTokenizer 클래스를 사용
            // 라인 한줄을 읽고 다음 라인을 읽고 싶을 때는 new StringTokenizer(br.readLine()); 을 추가
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
        }
        br.close();
        System.out.println(sb);
    }
}
