package hackerrank;

import java.util.Scanner;

public class StringAnagrams {

	static boolean isAnagram(String a, String b) {

		if (a.length() != b.length())
			return false;

		char[] arrA = a.toLowerCase().toCharArray();
		char[] arrB = b.toLowerCase().toCharArray();

		sort(arrA);
		sort(arrB);

		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] == arrB[i]) {
				continue;
			} else {
				return false;
			}
		}

		return true;
	}

	public static void sort(char[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1");
		String a = scan.next();
		System.out.println("Enter String 2");
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
