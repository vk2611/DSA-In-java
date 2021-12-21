package ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

public class isUnique {
	public static boolean solution1(String str) {
		char charArr[] = str.toCharArray();
		Arrays.sort(charArr);
		String sortedString = new String(charArr);

		for (int i = 0; i < sortedString.length() - 1; i++) {
			if (sortedString.charAt(i) == sortedString.charAt(i + 1))
				return false;
		}
		return true;
	}

	public static boolean solution2(String str) {
		int countArr[] = new int[26];
		Arrays.fill(countArr, 0);
		for (int i = 0; i < str.length(); i++) {
			if (countArr[str.charAt(i) - 'a'] > 0)
				return false;
			else {
				countArr[str.charAt(i) - 'a'] = 1;
			}
		}
		return true;
	}

	public static boolean solution3(String str) {
		return true;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(solution1(str));
		System.out.println(solution2(str));
		System.out.println(solution3(str));
		s.close();

	}
}
