import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class AlarmWatch {
    public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //readLine() 은 한 행을 전부 읽기 때문에 
 		String str = br.readLine();
        //공백단위로 입력해 준 문자열을 공백단위로 분리
		StringTokenizer st = new StringTokenizer(str," ");
		 
        int H = Integer.parseInt(st.nextToken());// 시
		int M = Integer.parseInt(st.nextToken());// 분
		
        //입력받은 분(minute) 을 45 기준으로 45보다 작으면
		if(M < 45) {
			H--; // 시(hour) 1 감소
			M = 60 - (45 - M); // 분(min) 감소
			// 시(hour)가 0보다 작아질 경우
            if(H < 0) {
                //시(hour) 을 23으로 수정
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
		}
    }
}
