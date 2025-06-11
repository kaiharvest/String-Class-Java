package programmer.zaman.now.classes;

// Jika ada kebutuhan angka besar melebihi Long pakai(BigInteger) dan Double pakai(BigDecimal)
// BigInteger adalah class untuk handle tipe data Integer
// BigDecimal adalah class untuk handle tipe data floating point

import java.math.BigInteger;

public class BigNumberClass {
	public static void main(String[] args) {

		BigInteger a = new BigInteger("1000000000000000000");
		BigInteger b = new BigInteger("1000000000000000000");

		BigInteger result = a.add(b);

		System.out.println(result);

	}
}
