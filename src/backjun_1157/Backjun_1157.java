//========================
// 2020년 03월 15일
// 단어 공부
//========================
// 가장 많이 사용된 알파벳을 대문자로 출력.
//========================

package backjun_1157;
import java.util.*;

public class Backjun_1157{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
 
		String word = sc.next().toUpperCase();
		int[] alpha = new int[26];
		int maxValue = 0;
		char maxWord = 0;
		int maxWordCnt =0;

		
		for(int i=0; i<word.length(); i++) {
			alpha[word.charAt(i)-65]++;
		}
		
//		for(int i=0; i<alpha.length; i++) {
//			System.out.print(alpha[i]);
//		}
		
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i]>maxValue) {
				maxWord=(char)(i+65);
				maxValue=alpha[i];
			}
		}
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i]==maxValue) maxWordCnt++;
		}
		
//		System.out.println();
//		System.out.println(maxWord);
//		System.out.println(maxWordCnt);
		

		if(maxWordCnt==1) {
			System.out.println(maxWord);
		}
		else {
			System.out.println("?");
		}
		
		
	}
}
