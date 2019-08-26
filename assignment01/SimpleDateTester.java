package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
        SimpleDate theDate = new SimpleDate(2019,8,25);
        SimpleDate otherDate = new SimpleDate(2016,5,25);
        System.out.println(theDate);
        System.out.println(otherDate);
        System.out.println(theDate.before(otherDate));

        try(var output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }
}
