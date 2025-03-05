package programmer.zaman.now.classes;

// StringJoiner Class adalah class yang bisa digunakan untuk membuat String sequence yanng dipisahkan dengan
//      delimiter atau pemisah
// StringJoiner juga mendukung prefix(didepannya) dan suffix(dibelakangnya) jika kita ingin menambahkannya


import java.util.StringJoiner;

public class StringJoinerApp {
	public static void main(String[] args) {

		String[] names = {"Indra", "Dwi" ,"Prabowo"};
		StringJoiner joiner = new StringJoiner(", ", "[", "]");

		for (var name : names) {
			joiner.add(name);
		}

		System.out.println(joiner.toString());

	}
}


