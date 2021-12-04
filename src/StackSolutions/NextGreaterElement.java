package StackSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

	public static List<Integer> findNext(List<Integer> a) {
		Stack<Integer> arr = new Stack<>();


		List<Integer> ans = new ArrayList<Integer>(a.size()+10);
		for(int i=0;i<a.size();i++) {
			while (!arr.isEmpty() && a.get(i)>a.get(arr.peek())) {
				ans.add(arr.peek(), a.get(i));
				arr.pop();
			}
			arr.push(i);
		}
		while(!arr.empty()) {
			ans.add(arr.peek(), -1);
		}

		return ans;

	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int e = s.nextInt();
			a.add(e);
		}
		List<Integer> ans = findNext(a);
		for(Integer p:ans) {
			System.out.println(p);
		}
		s.close();
	}
}
