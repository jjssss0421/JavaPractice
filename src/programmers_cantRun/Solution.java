package programmers_cantRun;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        for(int i=0; i<participant.length; i++){
            boolean flag=false;
            for(int j=0; j<completion.length; j++){
                if(participant[i].equals(completion[j])){
                    flag=true;
                    completion[j]="";
                }
            }
            if(flag==false){
                answer=participant[i];
                break;
            }
        }
        return answer;
    }
}
