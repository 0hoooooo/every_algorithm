import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average {
	public static double grade(double v, double max) {
        	return v / max * 100;
    }
    public static void main(String[] args) throws IOException{
		// 값 구하는 함수 만들기
		// score을 넣었을때 score / M * 100 공식으로 값이 반환
    	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 시험본 과목 개수 N 입력받기
		int N = Integer.parseInt(br.readLine());
		// 시험본 과목 성적 N크기의 배열로 선언
		double score[] = new double[N]; 
		 // 점수를 공백을 기준으로 나눠서 받아야하므로 StringTokenizer 만들기
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
		// 평균 
		double avg = 0;
		// 합
        double sum = 0;
      
        // for문을 선언하여 개수 만큼 돌려 배열에 넣기
		for(int i=0; i<N;i++) {
			score[i] = Double.parseDouble(st.nextToken());
		}
	    // 배열의 값들을 정렬하여 최댓값이 맨 마지막으로 오게하기
        Arrays.sort(score);
		// for문에 주어진 계산식을 사용하여 배열의 값들을 변경
		for(int i=0;i<score.length;i++) {
			// sum에 grade 함수를 이용해 저장
			sum += grade(score[i], score[(N - 1)]);
		}
		br.close();
		// 평균값을 계산하여 출력
		avg = sum / N;
		
		System.out.println(avg);
		
		
	}
}
