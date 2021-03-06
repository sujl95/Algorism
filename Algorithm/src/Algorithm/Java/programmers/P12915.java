package Algorithm.Java.programmers;

import java.util.*;

public class P12915 {

	public static void main(String[] args) {
		String arr[] = {"abcd", "abce", "cdx"};
		System.out.println(Arrays.toString(solution(arr,2)));
		
	}
	public static String[] solution(String[] strings, int n) {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].charAt(n)+strings[i];
		}
		Arrays.sort(strings);
		String[] answer = new String[strings.length];
		for (int i = 0; i < strings.length; i++) {
			answer[i]= strings[i].substring(1);
		}
		return answer;
    }
}
