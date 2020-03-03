//========================
// 2020년 03월 03일
// 숫자의 합
//========================
// 첫째 줄에 숫자의 개수 N.
// 둘째 줄에 숫자 N개가 공백없이.
// 이 숫자를 모두 합해서 출력.
//========================

package backjun_11720;
import java.util.*;

public class Backjun_11720{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String num = input.next();
		String[] nums = num.split("");
		
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum += Integer.parseInt(nums[i]);
		}
		
		System.out.println(sum);
				
	}
	
}

