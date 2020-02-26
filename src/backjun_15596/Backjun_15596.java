//========================
// 2020년 02월 26일
// 정수 N개의 합
//========================
// 정수 N개의 합을 구하는 함수 구현.(Sum 함수 구현)
//========================

package backjun_15596;
import java.util.*;

public class Backjun_15596{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] a = new int[N];
		
		for(int i=0; i<N; i++) {
			a[i] = input.nextInt();
		}
		
		System.out.println(sum(a));
		
	}
	
	static long sum(int[] a) {
        long ans = 0;
        for(int i=0; i<a.length; i++){
            ans= ans+a[i];
        }
        return ans;
    }
}