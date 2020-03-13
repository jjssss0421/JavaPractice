//========================
// 2020년 03월 13일
// 상수
//========================
// 734(A)와 893(B)가 있다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것
// 세자리의 두 수를 입력했을 때 상수의 대답 출력.
//========================

package backjun_2908;
import java.util.*;

public class Backjun_2908{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] A = sc.next().split(""), B = sc.next().split("");

		String resultA = A[2]+A[1]+A[0];
		String resultB = B[2]+B[1]+B[0];
		
		if(Integer.parseInt(resultA)>Integer.parseInt(resultB)) System.out.println(resultA);
		else System.out.println(resultB);
	}
}


// 이렇게 하면 처음부터 int로 받아도 처리할 수 있음.
// c=(a%10)*100+(a/10%10)*10+a/100;
// d=(b%10)*100+(b/10%10)*10+b/100;