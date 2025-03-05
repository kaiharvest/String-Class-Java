package programmer.zaman.now.classes;

// semua number class yang bukan primitif parent class yang sama yaitu class Number
// class Number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe Number lain

public class NumberClass {
	public static void main(String[] args) {

		Integer intvalue = 10;

		Long longValue = intvalue.longValue();
		Double doubleValue = longValue.doubleValue();
		Short shortValue = doubleValue.shortValue();

		// konversi stirng ke number
		String number1 = "1000";
		String number2 = "10.20";

		Integer intContoh = Integer.valueOf(number1);
		System.out.println(intContoh);

		Double doubleContoh = Double.valueOf(number2);
		System.out.println(doubleContoh);

	}
}
