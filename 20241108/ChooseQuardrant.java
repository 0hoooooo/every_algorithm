import java.io.*;

public class ChooseQuardrant {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        	// x와 y가 모두 양수인 경우에는 제1 사분면에 속한다
		if(x > 0 && y > 0) {
			System.out.println(1);
		//x는 음수이고, y는 양수인 경우에는 제2 사분면에 속한다
		}else if(x < 0 && y > 0) {
			System.out.println(2);
		//x와 y가 모두 음수인 경우에는 제3 사분면에 속한다
		}else if(x < 0 && y < 0) {
			System.out.println(3);
		//그 외의 경우, x가 양수이거나 음수이고, y가 0이거나 음수인 경우에는 제4 사분면에 속한다.
		}else {
			System.out.println(4);
		}
    }
}