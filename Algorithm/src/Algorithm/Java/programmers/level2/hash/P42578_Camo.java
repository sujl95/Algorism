package Algorithm.Java.programmers.level2.hash;

import java.util.HashMap;
import java.util.Map;

public class P42578_Camo {
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

		System.out.println(solution(clothes));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map = new HashMap<>();
		for (String[] clothe : clothes) {
			map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
		}
		for (int value : map.values()) {
			answer *= value + 1;
		}
		answer -= 1;
		return answer;
	}
}
