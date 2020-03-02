//========================
// 2020년 03월 02일
// 빗물
//========================
// 2차원 세계에서는 한 칸의 용량은 1이다. 고이는 빗물의 총량을 출력하여라.
//========================

package backjun_14719;
import java.util.*;

public class Backjun_14719{
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int[][] rain = new int[input.nextInt()][input.nextInt()];
		
		
		for(int i=0; i<rain[0].length; i++) {
			int height = input.nextInt();
			for(int j=0; j<height; j++) {
				rain[j][i]=1;
			}
		}
		
		int cnt=0;
		int tmp;
		boolean flag = false;
		int k=0;
		for(int i=0; i<rain.length; i++) {
			int j=k;
			for(; j<rain[0].length; j++) {
				if(rain[i][j]==1) {
					for(; k<rain[0].length; k++) {
						cnt++;
						if(rain[i][k]==1) break;
					}
				}
			}
			System.out.println(i+" "+cnt);
		}

		for(int i=0; i<rain.length; i++) {
			for(int j=0; j<rain[0].length; j++) {
				System.out.print(rain[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println(cnt);
	}
	

	
}
