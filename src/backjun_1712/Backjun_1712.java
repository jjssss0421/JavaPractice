//========================
// 2020년 03월 08일
// 손익분기점
//========================
// A = 고정비용, B = 가변비용, C = 판매가격
// 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점 출력.
//========================

package backjun_1712;
import java.util.*;

public class Backjun_1712{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		long point =0;
		long A = input.nextInt();
		long B = input.nextInt();
		long C = input.nextInt();
		
		if(C-B<=0) point=-1;
		else point = (A/(C-B))+1;
		
		System.out.println(point);
		
		
//==================
//숏코딩 : 삼항연산
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		System.out.println((c>b)?(a/(c-b))+1:-1);
//		
		
		
	}
}





//
//A + B*x < C*x
//= A < C*x- B*x
//= A < (C-B)*x
//= A/(C-B) < x

