package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
        DateAndPlaceOfBirth birth1 = new DateAndPlaceOfBirth(1990,6,20, "Binghamton","New York", "USA");
        DateAndPlaceOfBirth birth2 = new DateAndPlaceOfBirth(1990,6,20, "New York City","New York", "USA");
        DateAndPlaceOfBirth birth3 = new DateAndPlaceOfBirth(1995,6,20, "Syracuse","New York", "USA");
        DateAndPlaceOfBirth birth4 = new DateAndPlaceOfBirth(1996,10,1, "London","UK");
        DateAndPlaceOfBirth birth5 = new DateAndPlaceOfBirth(1997,1,2, "Paris","France");
        System.out.println(birth1);
        System.out.println(birth1.hasSameBirthDayAs(birth2));
        System.out.println(birth1.hasSameBirthDayAs(birth3));
        System.out.println(birth1.hasSameBirthDayAs(birth4));
        System.out.println(birth1.hasSameBirthDayAs(birth5));

        System.out.println(birth1.hasSameBirthDateAs(birth2));
        System.out.println(birth1.hasSameBirthDateAs(birth3));
        System.out.println(birth1.hasSameBirthDateAs(birth4));
        System.out.println(birth1.hasSameBirthDateAs(birth5));

        System.out.println(birth1.youngerThan(birth2));
        System.out.println(birth1.youngerThan(birth3));
        System.out.println(birth1.youngerThan(birth4));
        System.out.println(birth1.youngerThan(birth5));

        System.out.println(birth1.olderThan(birth2));
        System.out.println(birth1.olderThan(birth3));
        System.out.println(birth1.olderThan(birth4));
        System.out.println(birth1.olderThan(birth5));


        System.out.println(birth2);
        System.out.println(birth2.hasSameBirthDayAs(birth1));
        System.out.println(birth2.hasSameBirthDayAs(birth3));
        System.out.println(birth2.hasSameBirthDayAs(birth4));
        System.out.println(birth2.hasSameBirthDayAs(birth5));

        System.out.println(birth2.hasSameBirthDateAs(birth1));
        System.out.println(birth2.hasSameBirthDateAs(birth3));
        System.out.println(birth2.hasSameBirthDateAs(birth4));
        System.out.println(birth2.hasSameBirthDateAs(birth5));

        System.out.println(birth2.youngerThan(birth1));
        System.out.println(birth2.youngerThan(birth3));
        System.out.println(birth2.youngerThan(birth4));
        System.out.println(birth2.youngerThan(birth5));

        System.out.println(birth2.olderThan(birth1));
        System.out.println(birth2.olderThan(birth3));
        System.out.println(birth2.olderThan(birth4));
        System.out.println(birth2.olderThan(birth5));


        System.out.println(birth3);
        System.out.println(birth3.hasSameBirthDayAs(birth1));
        System.out.println(birth3.hasSameBirthDayAs(birth2));
        System.out.println(birth3.hasSameBirthDayAs(birth4));
        System.out.println(birth3.hasSameBirthDayAs(birth5));

        System.out.println(birth3.hasSameBirthDateAs(birth1));
        System.out.println(birth3.hasSameBirthDateAs(birth2));
        System.out.println(birth3.hasSameBirthDateAs(birth4));
        System.out.println(birth3.hasSameBirthDateAs(birth5));

        System.out.println(birth3.youngerThan(birth1));
        System.out.println(birth3.youngerThan(birth2));
        System.out.println(birth3.youngerThan(birth4));
        System.out.println(birth3.youngerThan(birth5));

        System.out.println(birth3.olderThan(birth1));
        System.out.println(birth3.olderThan(birth2));
        System.out.println(birth3.olderThan(birth4));
        System.out.println(birth3.olderThan(birth5));


        System.out.println(birth4);
        System.out.println(birth4.hasSameBirthDayAs(birth1));
        System.out.println(birth4.hasSameBirthDayAs(birth2));
        System.out.println(birth4.hasSameBirthDayAs(birth3));
        System.out.println(birth4.hasSameBirthDayAs(birth5));

        System.out.println(birth4.hasSameBirthDateAs(birth1));
        System.out.println(birth4.hasSameBirthDateAs(birth2));
        System.out.println(birth4.hasSameBirthDateAs(birth3));
        System.out.println(birth4.hasSameBirthDateAs(birth5));

        System.out.println(birth4.youngerThan(birth1));
        System.out.println(birth4.youngerThan(birth2));
        System.out.println(birth4.youngerThan(birth3));
        System.out.println(birth4.youngerThan(birth5));

        System.out.println(birth4.olderThan(birth1));
        System.out.println(birth4.olderThan(birth2));
        System.out.println(birth4.olderThan(birth3));
        System.out.println(birth4.olderThan(birth5));


        System.out.println(birth5);
        System.out.println(birth5.hasSameBirthDayAs(birth1));
        System.out.println(birth5.hasSameBirthDayAs(birth2));
        System.out.println(birth5.hasSameBirthDayAs(birth3));
        System.out.println(birth5.hasSameBirthDayAs(birth4));

        System.out.println(birth5.hasSameBirthDateAs(birth1));
        System.out.println(birth5.hasSameBirthDateAs(birth2));
        System.out.println(birth5.hasSameBirthDateAs(birth3));
        System.out.println(birth5.hasSameBirthDateAs(birth4));

        System.out.println(birth5.youngerThan(birth1));
        System.out.println(birth5.youngerThan(birth2));
        System.out.println(birth5.youngerThan(birth3));
        System.out.println(birth5.youngerThan(birth4));

        System.out.println(birth5.olderThan(birth1));
        System.out.println(birth5.olderThan(birth2));
        System.out.println(birth5.olderThan(birth3));
        System.out.println(birth5.olderThan(birth4));

        try(var output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

        DateAndPlaceOfBirth xbirth1 = new DateAndPlaceOfBirth(1990,6,20, "Binghamton","New York", "USA");
        DateAndPlaceOfBirth xbirth2 = new DateAndPlaceOfBirth(1990,6,20, "New York City","New York", "USA");
        DateAndPlaceOfBirth xbirth3 = new DateAndPlaceOfBirth(1995,6,20, "Syracuse","New York", "USA");
        DateAndPlaceOfBirth xbirth4 = new DateAndPlaceOfBirth(1996,10,1, "London","UK");
        DateAndPlaceOfBirth xbirth5 = new DateAndPlaceOfBirth(1997,1,2, "Paris","France");
        output.println(xbirth1);
        output.println(xbirth1.hasSameBirthDayAs(xbirth2));
        output.println(xbirth1.hasSameBirthDayAs(xbirth3));
        output.println(xbirth1.hasSameBirthDayAs(xbirth4));
        output.println(xbirth1.hasSameBirthDayAs(xbirth5));

        output.println(xbirth1.hasSameBirthDateAs(xbirth2));
        output.println(xbirth1.hasSameBirthDateAs(xbirth3));
        output.println(xbirth1.hasSameBirthDateAs(xbirth4));
        output.println(xbirth1.hasSameBirthDateAs(xbirth5));

        output.println(xbirth1.youngerThan(xbirth2));
        output.println(xbirth1.youngerThan(xbirth3));
        output.println(xbirth1.youngerThan(xbirth4));
        output.println(xbirth1.youngerThan(xbirth5));

        output.println(xbirth1.olderThan(xbirth2));
        output.println(xbirth1.olderThan(xbirth3));
        output.println(xbirth1.olderThan(xbirth4));
        output.println(xbirth1.olderThan(xbirth5));


        output.println(xbirth2);
        output.println(xbirth2.hasSameBirthDayAs(xbirth1));
        output.println(xbirth2.hasSameBirthDayAs(xbirth3));
        output.println(xbirth2.hasSameBirthDayAs(xbirth4));
        output.println(xbirth2.hasSameBirthDayAs(xbirth5));

        output.println(xbirth2.hasSameBirthDateAs(xbirth1));
        output.println(xbirth2.hasSameBirthDateAs(xbirth3));
        output.println(xbirth2.hasSameBirthDateAs(xbirth4));
        output.println(xbirth2.hasSameBirthDateAs(xbirth5));

        output.println(xbirth2.youngerThan(xbirth1));
        output.println(xbirth2.youngerThan(xbirth3));
        output.println(xbirth2.youngerThan(xbirth4));
        output.println(xbirth2.youngerThan(xbirth5));

        output.println(xbirth2.olderThan(xbirth1));
        output.println(xbirth2.olderThan(xbirth3));
        output.println(xbirth2.olderThan(xbirth4));
        output.println(xbirth2.olderThan(xbirth5));


        output.println(xbirth3);
        output.println(xbirth3.hasSameBirthDayAs(xbirth1));
        output.println(xbirth3.hasSameBirthDayAs(xbirth2));
        output.println(xbirth3.hasSameBirthDayAs(xbirth4));
        output.println(xbirth3.hasSameBirthDayAs(xbirth5));

        output.println(xbirth3.hasSameBirthDateAs(xbirth1));
        output.println(xbirth3.hasSameBirthDateAs(xbirth2));
        output.println(xbirth3.hasSameBirthDateAs(xbirth4));
        output.println(xbirth3.hasSameBirthDateAs(xbirth5));

        output.println(xbirth3.youngerThan(xbirth1));
        output.println(xbirth3.youngerThan(xbirth2));
        output.println(xbirth3.youngerThan(xbirth4));
        output.println(xbirth3.youngerThan(xbirth5));

        output.println(xbirth3.olderThan(xbirth1));
        output.println(xbirth3.olderThan(xbirth2));
        output.println(xbirth3.olderThan(xbirth4));
        output.println(xbirth3.olderThan(xbirth5));


        output.println(xbirth4);
        output.println(xbirth4.hasSameBirthDayAs(xbirth1));
        output.println(xbirth4.hasSameBirthDayAs(xbirth2));
        output.println(xbirth4.hasSameBirthDayAs(xbirth3));
        output.println(xbirth4.hasSameBirthDayAs(xbirth5));

        output.println(xbirth4.hasSameBirthDateAs(xbirth1));
        output.println(xbirth4.hasSameBirthDateAs(xbirth2));
        output.println(xbirth4.hasSameBirthDateAs(xbirth3));
        output.println(xbirth4.hasSameBirthDateAs(xbirth5));

        output.println(xbirth4.youngerThan(xbirth1));
        output.println(xbirth4.youngerThan(xbirth2));
        output.println(xbirth4.youngerThan(xbirth3));
        output.println(xbirth4.youngerThan(xbirth5));

        output.println(xbirth4.olderThan(xbirth1));
        output.println(xbirth4.olderThan(xbirth2));
        output.println(xbirth4.olderThan(xbirth3));
        output.println(xbirth4.olderThan(xbirth5));


        output.println(xbirth5);
        output.println(xbirth5.hasSameBirthDayAs(xbirth1));
        output.println(xbirth5.hasSameBirthDayAs(xbirth2));
        output.println(xbirth5.hasSameBirthDayAs(xbirth3));
        output.println(xbirth5.hasSameBirthDayAs(xbirth4));

        output.println(xbirth5.hasSameBirthDateAs(xbirth1));
        output.println(xbirth5.hasSameBirthDateAs(xbirth2));
        output.println(xbirth5.hasSameBirthDateAs(xbirth3));
        output.println(xbirth5.hasSameBirthDateAs(xbirth4));

        output.println(xbirth5.youngerThan(xbirth1));
        output.println(xbirth5.youngerThan(xbirth2));
        output.println(xbirth5.youngerThan(xbirth3));
        output.println(xbirth5.youngerThan(xbirth4));

        output.println(xbirth5.olderThan(xbirth1));
        output.println(xbirth5.olderThan(xbirth2));
        output.println(xbirth5.olderThan(xbirth3));
        output.println(xbirth5.olderThan(xbirth4));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


    }
}
