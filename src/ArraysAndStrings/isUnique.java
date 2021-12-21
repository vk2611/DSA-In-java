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

	public static void solution2(String str) {

	}

	public static void solution3(String str) {

	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(solution1(str));
		solution2(str);
		solution3(str);
		s.close();

	}
}
