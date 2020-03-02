//========================
// 2020년 02월 26일
// 완주하지 못한 선수
//========================
// 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
// 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성
//========================

package programmers_cantRun;
import java.util.*;

public class Programmers_cantRun{
	public static void main(String args[]) {
		Solution solution = new Solution();
		Scanner input = new Scanner(System.in);
		String[] participant = new String[input.nextInt()];
		for(int i=0; i<participant.length; i++) {
			participant[i] = input.next();
		}
		String[] completion = new String[input.nextInt()];
		for(int i=0; i<completion.length; i++) {
			completion[i] = input.next();
		}
		System.out.println(solution.solution(participant, completion));
		
		
	}
}