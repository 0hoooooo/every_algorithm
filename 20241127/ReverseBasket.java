import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReverseBasket {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
        // 바구니 개수 N개
		int N = Integer.parseInt(st.nextToken());
		// 바구니 순서 바꾸는 횟수 M
        int M = Integer.parseInt(st.nextToken()); 
		// 순서 바꾸기 위한 temp 변수 선언
		int temp = 0;
		// N크기의 일차원 배열의 바구니 선언
		int busket[] = new int[N];
        // 각각 바구니에 1번부터 N번까지 번호 INSERT
		// 인덱스와 바구니 숫자 맞추기 위해 i+1
		for(int i = 0; i < busket.length; i++) {
			busket[i] = i+1;
		}
		// 순서바꾸는 동안 FOR문
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			for(int j = a ; j <= b; j ++){
				temp = busket[a];
				busket[a] = busket[b];
				busket[b] = temp;
				a++;
				b--;
			}
		}
		
		br.close();
		
		for(int i=0;i<busket.length;i++) {
			System.out.print(busket[i]+" ");
		}
		
	}
}
