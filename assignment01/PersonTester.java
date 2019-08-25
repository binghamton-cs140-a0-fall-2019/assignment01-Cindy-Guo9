package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
        StreetUSAddress myaddr = new StreetUSAddress("4321 Court Street","","Los Angeles","CA","90001");
        DateAndPlaceOfBirth mybirth = new DateAndPlaceOfBirth(1994,12,12, "Binghamton","New York", "USA");
        Person myPerson = new Person("Bob","Smith","111-22-3333",mybirth,myaddr);
        System.out.println(myPerson);


        try(var output = new PrintWriter(new FileOutputStream(
                new File("output.txt"), true /* true means append to file */))) {
            output.println("\nTESTS FOR PersonTester.java:");

        //Copy all your lines above, add an extra "2" to every variable name
        // and replace every System.out.print or System.out.println
        // by output.print or output.println
        StreetUSAddress myaddr2 = new StreetUSAddress("4321 Court Street","","Los Angeles","CA","90001");
        DateAndPlaceOfBirth mybirth2 = new DateAndPlaceOfBirth(1994,12,12, "Binghamton","New York", "USA");
        Person myPerson2 = new Person("Bob","Smith","111-22-3333",mybirth2,myaddr2);
        output.println(myPerson2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//prints in a weird format
