package Algorithm.Java.programmers.practice;

public class P12919 {

	public static void main(String[] args) {
		//https://programmers.co.kr/learn/courses/30/lessons/12919
		//서울에서 김서방 찾기
		String seoul[] = {"Jane","Kim"};
		System.out.println(solution(seoul));
	}
	
	public static String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length;i++) {
        	if(seoul[i].equals("Kim")) {
        		answer = "\"김서방은 "+i+"에 있다\"";
        		break;
        	}
        }
        return answer;
    }
}
