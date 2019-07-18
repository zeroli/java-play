import java.util.Calendar;
import java.util.Locale;

public class TestFormat {
	public static void main(String[] args) {
		long n = 461012;
		System.out.format("%d%n", n);
		System.out.format("%08d%n", n);

		double pi = Math.PI;
		System.out.format("%f%n", pi);

		Calendar c = Calendar.getInstance();
		System.out.format("%tB %te, %tY%n", c, c, c);

	}
}

