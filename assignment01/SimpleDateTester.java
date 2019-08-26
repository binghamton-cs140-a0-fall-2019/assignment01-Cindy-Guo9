package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
        SimpleDate theDate = new SimpleDate();
		theDate.of(2019,8,25);
        SimpleDate otherDate = new SimpleDate();
		theDate.of(2016,5,25);
		SimpleDate sameDate = new SimpleDate();
		theDate.of(2019,8,25);
		SimpleDate mDate = new SimpleDate();
		theDate.of(2019,8,20);
		SimpleDate dDate = new SimpleDate();
		theDate.of(2019,7,25);
        System.out.println(theDate.before(otherDate));// MUST DO THIS FOR ALL COMBOS (SAME DATE/SAME MONTH/SAME DAY)

        try(var output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		SimpleDate theDate2 = new SimpleDate();
		theDate2.of(2019,8,25);
        SimpleDate otherDate2 = new SimpleDate();
		theDate2.of(2016,5,25);
    	output.println(theDate.before(otherDate2));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }
}

//dir
//javac -d . *.java
