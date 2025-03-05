package programmer.zaman.now.classes;

// StringTokenizer class adalah class yang digunakan untu mentoring String menjadi token atau string yng lebih kecil
// bisa menggunakan string delimiter yang kita mau

import java.util.StringTokenizer;

public class StringTokenizerClass {
	public static void main(String[] args) {

		String name = "Indra Dwi Prabowo";
		StringTokenizer tokenizer = new StringTokenizer(name, " ");

		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}

	}
}
