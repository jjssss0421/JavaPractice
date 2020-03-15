//========================
// 2020년 03월 14일
// 그룹 단어 체커
//========================
// ccazzzzbb, kin  : 그룹단어   //   aabba : 그룹단어 X (a가 a끼리 있지 않기때문)
// N개의 단어를 입력 받은 후 , 그룹단어의 개수 출력.
//========================

package backjun_1316;
import java.util.*;

public class Backjun_1316{
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] words = new String[N];
		int groupCnt = 0;
		
		for(int i=0; i<N; i++) {
			words[i] = sc.next();
		}
		for(int i=0; i<words.length; i++) {
			String check ="";
			boolean flag = true;
			for(int j=0; j<words[i].length(); j++) {
				if(j==0) check += words[i].charAt(j);
				else {
					if(words[i].charAt(j)!=words[i].charAt(j-1)) {
						for(int k=0; k<check.length(); k++) {
							if(check.charAt(k)==words[i].charAt(j)) {
								flag=false;
								break;
							}
						}
						check+=words[i].charAt(j);
					}
				}
				if(!flag) break;
			}
			if(flag) groupCnt++;
		}
		System.out.println(groupCnt);
	}
}