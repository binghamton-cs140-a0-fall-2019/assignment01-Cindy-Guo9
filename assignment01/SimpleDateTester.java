package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
        SimpleDate theDate = new SimpleDate();
		theDate.of(2019,8,25);
        SimpleDate otherDate = new SimpleDate();//true
		otherDate.of(2016,5,25);
		SimpleDate sameDate = new SimpleDate();
		sameDate.of(2019,8,25);
		SimpleDate mDate = new SimpleDate(); //true
		mDate.of(2019,8,20);
		SimpleDate dDate = new SimpleDate();//true
		dDate.of(2019,7,25);
		SimpleDate laterDate = new SimpleDate();
		laterDate.of(2020,9,5);
		SimpleDate future = new SimpleDate();
		future.of(2019,5,25);
        System.out.println(theDate.before(otherDate));
		System.out.println(theDate.before(sameDate));
		System.out.println(theDate.before(mDate));
		System.out.println(theDate.before(dDate));
		System.out.println(theDate.before(laterDate));
		System.out.println(theDate.before(future));

        try(var output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		SimpleDate theDate2 = new SimpleDate();
		theDate2.of(2019,8,25);
        SimpleDate otherDate2 = new SimpleDate();
		otherDate2.of(2016,5,25);
		SimpleDate sameDate2 = new SimpleDate();
		sameDate2.of(2019,8,25);
		SimpleDate mDate2 = new SimpleDate();
		mDate2.of(2019,8,20);
		SimpleDate dDate2 = new SimpleDate();
		dDate2.of(2019,7,25);
		SimpleDate laterDate2 = new SimpleDate();
		laterDate2.of(2020,9,5);
		SimpleDate future2 = new SimpleDate();
		future2.of(2019,5,25);
		System.out.println(theDate.before(otherDate2));
		System.out.println(theDate.before(sameDate2));
		System.out.println(theDate.before(mDate2));
		System.out.println(theDate.before(dDate2));
		System.out.println(theDate.before(laterDate2));
		System.out.println(theDate.before(future2));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }
}

//dir
//javac -d . *.java
