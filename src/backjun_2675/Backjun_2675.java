//========================
// 2020년 03월 04일
// 문자열 반복
//========================
// 첫째 줄에 테스트 케이스의 개수 T 입력.
// 반복 횟수 R, 문자열 S가 공백으로 구분되어 주어진다.
// 입력 : 5 /HTP    => 출력 : /////HHHHHTTTTTPPPPP
//========================

package backjun_2675;
import java.util.*;

public class Backjun_2675{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		
		for(int i=0; i<R; i++) {
			int cnt = input.nextInt();
			String[] S = (input.next()).split("");
			for(int j=0; j<S.length; j++) {
				for(int k=0; k<cnt; k++) System.out.print(S[j]);
			}
			System.out.println();
		}
		
		
//		숏코딩
//		Scanner s=new Scanner(System.in);
//		String r,x;
//		for(int t=s.nextInt(),n,i,j;t-->0;System.out.println(x))
//			for(n=s.nextInt(),r = s.next(),x="",i=0;i<r.length();i++)
//				for(j=n;j-->0;) x+=r.charAt(i);
		
	}
	
}
