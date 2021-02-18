package Algorithm.Java.programmers.level2.DfsBfs;

public class P43165_TargetNumber {

	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 1;
		System.out.println("solution() = " + solution(numbers,target));
	}

	public static int solution(int[] numbers, int target) {
		return dfs(numbers, target, 0, 0);
	}

	private static int dfs(int[] numbers, int target, int idx, int number) {
		if (idx == numbers.length) {
			return number == target ? 1 : 0;
		}
		return dfs(numbers, target, idx + 1, number + numbers[idx])
				+ dfs(numbers, target, idx + 1, number - numbers[idx]);
	}

}
