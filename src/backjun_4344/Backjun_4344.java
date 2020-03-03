//========================
// 2020년 02월 26일
// 평균은 넘겠지
//========================
// 첫 줄에 테스트 케이스 개수 입력.(C)
// 둘째 줄부터 각 테스트 케이스마다 학생의 수(N)가 첫 수로 입력, 이어서 N명의 점수 입력.
// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력.
//========================

package backjun_4344;
import java.util.*;

public class Backjun_4344 {
	
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int C = input.nextInt();
        int N;
        
        for(int i=0; i<C; i++){
        	N = input.nextInt();
    		double[] scores = new double[N];
        	double sum=0;
        	double avg=0;
    		double cnt=0;
        	
        	for(int j=0; j<N; j++) {
        		scores[j] = input.nextInt();
        		sum = sum+scores[j];
        	}
        	avg=sum/N;
        	for(int j=0; j<N; j++) {
        		if(scores[j]>avg) {
        			cnt++;
        		}
        	}
        	System.out.println( String.format("%.3f",cnt/N*100) + "%");
        }
        
        
    }

    
    
}
