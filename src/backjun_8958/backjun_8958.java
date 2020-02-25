//========================
//OX퀴즈 결과 점수
//첫 줄에 테스트 개수
//테스트 개수 만큼의 테스트결과 입력 , 각 줄의 테스트 결과 점수 출력
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점
//========================

package backjun_8958;
import java.util.*;

public class backjun_8958 {
	
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] score = new int[N];
        
        for(int i=0; i<N; i++){
            String[] OX = (input.next()).split("");
            int cnt=0;
            for(int j=0; j<OX.length; j++){
                score[i]=score[i]+cnt;
                if(OX[j].equals("O")){
                    cnt++;
                }
                else if(OX[j].equals("X")){
                    cnt=0;
                }
            }
            score[i]=score[i]+cnt;
        }
        
        for(int i=0; i<N; i++){
            System.out.println(score[i]);
        }
    }

}
