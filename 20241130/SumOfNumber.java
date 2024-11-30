import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumber {
   public static void main(String[]args) throws IOException {
    // 입력받기 위한 인터페이스 선언
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 더할 숫자 갯수 입력
    int n = Integer.parseInt(br.readLine());
    // 숫자의 합
    int sum = 0;
    // 숫자 입력받아 문자열 배열에 넣기
    String[] str = br.readLine().split("null");
    br.close();
    // 숫자 합 구하기
    for (int i = 0; i < n; i++) {
        sum += Integer.parseInt(str[i]);
    }
    System.out.println(sum);
   }
}
