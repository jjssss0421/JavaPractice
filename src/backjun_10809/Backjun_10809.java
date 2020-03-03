//========================
// 2020년 03월 03일
// 알파벳 찾기
//========================
// 첫째 줄에 단어 S 입력.
// 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력.
// 포함되어 있지 않다면 -1을 출력. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치.
//========================

package backjun_10809;
import java.util.*;

public class Backjun_10809{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String S = input.next();
		String[] SArr = S.split("");
		int[] order = new int[26];
		for(int i=0; i<order.length; i++) order[i]=-1;
		
		for(int i=0; i<SArr.length; i++) {
			if(order[(int)SArr[i].charAt(0)-97] == -1) {
				order[(int)SArr[i].charAt(0)-97] = i;
			}
		}
		
		for(int i=0; i<order.length; i++) {
			System.out.print(order[i]+" ");
		}
		
		
	}
}