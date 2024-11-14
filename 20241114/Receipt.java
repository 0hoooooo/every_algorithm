import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Receipt {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 영수증에 적힌 총 금액
        int X = Integer.parseInt(br.readLine());
        // 영수증에 적힌 구매한 물건의 종류의 수 
        int N = Integer.parseInt(br.readLine());
        // 직접 구매후 총 금액
        int total = 0;
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            total += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }
        // 영수증에 적힌 금액과 직접 구매한 금액이 맞으면
        if( X == total ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
