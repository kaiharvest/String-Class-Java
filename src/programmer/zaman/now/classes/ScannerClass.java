package programmer.zaman.now.classes;

// nextLine() : Membaca String
// nextInt() : Membaca int
// dll

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan nama: ");
		String nama = scanner.nextLine();

		System.out.print("Umur: ");
		int umur = scanner.nextInt();

		System.out.println("Hello " + nama + " umur " + umur);

	}
}
