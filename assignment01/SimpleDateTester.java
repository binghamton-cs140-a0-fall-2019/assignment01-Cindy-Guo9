package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
        SimpleDate theDate = new SimpleDate(2019,8,25);
        SimpleDate otherDate = new SimpleDate(2016,5,25);
        System.out.println(theDate)
        System.out.println(otherDate);
        System.out.println(theDate.before(otherDate));


    }
}
