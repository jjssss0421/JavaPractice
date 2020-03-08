// 2020. 03. 06
//========================
// num : 하루에 고칠 수 있는 냉장고 수
// arr : 각 일자별로 도착하는 냉장고 개수
// 모든 냉장고를 고치기 위해 필요한 작업 일수(day) 출력.
// ex) arr=[27, 0, 0, 0, 0, 9], num=9  -> day=4
//========================

package needDay;
import java.util.*;

public class NeedDay{
	public static void main(String args[]) {

		
		int[] arr = {100, 100};
		int num = 10;
		
		int day =0;
//============================================
		for(int i=0; i<arr.length; i++) {
			//System.out.println(day);
			if(i == arr.length-1 ) {
				//System.out.println("마지막");
				//System.out.println(Math.ceil(arr[i]/8.0));
				day+=Math.ceil((double)arr[i]/num);
			}
			else if(arr[i]>num) {
				//System.out.println(">"+num);
				arr[i+1]+=arr[i]-num;
				arr[i]=num;
				day++;
			}
			else if(arr[i]>0 && arr[i]<=num) {
				//System.out.println("<="+num); 
				day++;
			}
			for(int j=0; j<arr.length; j++) System.out.print(arr[j]+" ");
			System.out.println("");	
		}
//============================================
		
		System.out.println(day);
		

		
		
		
	}
}