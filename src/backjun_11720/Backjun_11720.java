//========================
// 2020년 02월 26일
// 한수
//========================
// 자연수 num 입력.
// 1보다 크거나 같고, num보다 작거나 같은 한수의 개수를 출력.
//========================

package backjun_11720;
import java.util.*;

public class Backjun_11720{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		System.out.println(hanSu(num));
	}
	
	static int hanSu(int num) {
		int cnt=0;
		for(int i=1; i<=num; i++) {
			if(i<100) {
				cnt++;
			}
			else {
				String[] numArr = Integer.toString(i).split("");
				Boolean flag = true;
				for(int j=0; j<numArr.length-2; j++) {
					if( Integer.parseInt(numArr[j+2]) - Integer.parseInt(numArr[j+1]) != Integer.parseInt(numArr[j+1])-Integer.parseInt(numArr[j]) ) {
						flag=false;
						break;
					}
				}
				if(flag == true) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}