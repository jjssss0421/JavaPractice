// 2020. 03. 06
//========================
// 해독하기
//========================
// library=["O ---"], message="... --- ..."
// answer = ?O?    (library 에 없으면 ?출력)
//========================

package test2;
import java.util.*;

public class Test2{
	public static void main(String args[]) {
		
		String[] library = {"O ---","S ..."};
		String message = "... --- ...";
		
        HashMap<String, String> hm = new HashMap();
		String answer = "";
//============================================
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		System.out.println(message);
//============================================
		
		
		for(int i=0; i<library.length; i++) {
			String tmp[] = library[i].split(" ");
            hm.put(tmp[1], tmp[0]);
            System.out.println(hm.get(tmp[0]));
		}
		
		String[] messageArr = message.split(" ");
		
		
		for(int i=0; i<messageArr.length; i++) {
			System.out.println("messageArr["+i+"]="+messageArr[i]);
			if(hm.containsKey(messageArr[i])) {
				answer+=hm.get(messageArr[i]);
			}
			else answer+="?";
		}
		
		System.out.println(answer);
		
		
		
		
	}
}