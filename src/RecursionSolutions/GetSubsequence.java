package RecursionSolutions;

import java.util.Scanner;
import java.util.ArrayList;

public class GetSubsequence {
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		ArrayList<String> arr = getSubSequence(str);
		System.out.println(arr);
		s.close();
	}

	public static ArrayList<String> getSubSequence(String str) {
		solve(str, 0, "");
		return arr;
	}

	public static void solve(String str, int i, String s) {
		if (i == str.length()) {
			arr.add(s);
			return;
		}
		solve(str, i + 1, s);
		solve(str, i + 1, s + str.charAt(i));
	}

}
