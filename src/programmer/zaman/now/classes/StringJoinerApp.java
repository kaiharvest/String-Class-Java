package programmer.zaman.now.classes;

// delimitter : pemisah
// prefix : diawal
// suffix : diakhir

import java.util.StringJoiner;

public class StringJoinerApp {
	public static void main(String[] args) {

		String[] names = {"Indra", "Dwi", "Prabowo"};
		StringJoiner joiner = new StringJoiner(", ", "[", "]");

		for (var name : names) {
			joiner.add(name);
		}

		System.out.println(joiner.toString());

	}
}
