import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinAndMax {
       public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // 개수 선언
            int N = Integer.parseInt(br.readLine());
            // 문자열 선언
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int index = 0;
            // 크기 N 배열 선언
            int[] arr = new int[N];
            // for 문 입력한 값들 배열에 삽입
            while(st.hasMoreTokens()){
                arr[index] = Integer.parseInt(st.nextToken());
                index++;
            }
            // 오름차순 정렬
            Arrays.sort(arr);;
            System.out.println(arr[0] + " " + arr[N-1]);
       }
       
}
