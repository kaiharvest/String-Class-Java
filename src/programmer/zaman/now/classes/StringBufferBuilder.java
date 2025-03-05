package programmer.zaman.now.classes;

public class StringBufferBuilder {
	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();
		builder.append("Indra");
		builder.append(" ");
		builder.append("Dwi");
		builder.append(" ");
		builder.append("Prabowo");
		builder.append(" ");

		String name = builder.toString();
		System.out.println(name);

	}
}