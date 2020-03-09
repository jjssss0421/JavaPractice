//========================
// 2020년 03월 09일
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
		int[] cnt = new int[26];
		int maxValue = 0;
		char maxWord = 0;
		int maxWordCnt =0;

		
		for(int i=0; i<word.length(); i++) {
			cnt[word.charAt(i)-65]++;
		}
		
		for(int i=0; i<cnt.length; i++) {
			System.out.print(cnt[i]);
		}
		
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i]>=maxValue) {
				maxWord=(char)(i+65);
				maxWordCnt++;
			}
		}
		
		System.out.println(maxWord);
		System.out.println(maxWordCnt);
		

		if(maxWordCnt==1) {
			System.out.println(maxWord);
		}
		else {
			System.out.println("?");
		}
		
		
		
		
		
		
// 왜 안되징		
//		String[] word = sc.next().split("");
//		HashMap<String, Integer> hm = new HashMap();
//		String maxWord ="";
//		int maxWordCnt =0;
//		
//		for(String wordOne : word) {
//				wordOne = wordOne.toUpperCase();
//				hm.put(wordOne, hm.getOrDefault(wordOne, 0)+1);
//		}
//		
//		Collection values = hm.values();
//		
//		Iterator<String> keys = hm.keySet().iterator();
//		while(keys.hasNext()) {
//			String key = keys.next();
//			if(hm.get(key)==Collections.max(values)) {
//				maxWord=key;
//				maxWordCnt++;
//			}
//		}
//		if(maxWordCnt==1) {
//			System.out.println(maxWord);
//		}
//		else {
//			System.out.println("?");
//		}
		
		
	}
}
