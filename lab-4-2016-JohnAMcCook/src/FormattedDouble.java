import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author John Cook
 *
 */
public class FormattedDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		DecimalFormat decimalFmt = new DecimalFormat("0.00");
		System.out.println("Type in a number.");
		Double db = scn.nextDouble();
		System.out.println("You typed in:" + db);
		System.out.println(decimalFmt.format(db));
	}

}