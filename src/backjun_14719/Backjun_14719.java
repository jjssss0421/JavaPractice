//========================
// 2020년 03월 03일
// 빗물
//========================
// 4 4
// 3 0 1 4   => 입력
// 빗물 고이는 총량 출력.
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
		int tmp=0;
		for(int i=0; i<rain.length; i++) {
			int j=0;
			int k=rain[0].length-1;
			for(;  j<rain[0].length; j++) {
				if(rain[i][j]==1) break;
			}
			for(; k>=0; k--) {
				if(rain[i][k]==1) break;
			}
			for(int l=j; l<=k; l++) {
				if(rain[i][l]==0) cnt++;
			}
		}
		

		
		System.out.println(cnt);
				
	}
	
}

