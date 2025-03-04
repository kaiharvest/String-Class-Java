package programmer.zaman.now.classes;

public class StringApp {
	public static void main(String[] args) {
		String name = "Indra Dwi Prabowo";
		String nameLowercase = name.toLowerCase();
		String nameUpercase = name.toUpperCase();

		System.out.println(name);
		System.out.println(nameLowercase);
		System.out.println(nameUpercase);
		System.out.println(name.length());
		System.out.println(name.startsWith("Indra"));
		System.out.println(name.endsWith("Dwi"));

		String[] names = name.split(" ");
		for (var value : names) {
			System.out.println(value);
		}

		System.out.println(" " .isBlank());
		System.out.println(" " .isEmpty());
		System.out.println("" .isEmpty());
	}
}
