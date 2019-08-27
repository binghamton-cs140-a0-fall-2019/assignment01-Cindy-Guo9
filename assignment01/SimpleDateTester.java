package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate theDate = SimpleDate.of(2019,8,25);

		SimpleDate sameDate = SimpleDate.of(2019,8,25);
		SimpleDate otherDate = SimpleDate.of(2016,5,25);
		SimpleDate mDate = SimpleDate.of(2019,8,26);
		SimpleDate dDate = SimpleDate.of(2019,7,25);
		SimpleDate laterDate = SimpleDate.of(2020,9,5);
		SimpleDate future = SimpleDate.of(2019,10,25);
		System.out.println(theDate.before(sameDate)); //false
        System.out.println(theDate.before(otherDate)); //false
		System.out.println(theDate.before(mDate));  //true
		System.out.println(theDate.before(dDate));  //false
		System.out.println(theDate.before(laterDate)); //true
		System.out.println(theDate.before(future)); //true

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

//dir
//javac -d . *.java
