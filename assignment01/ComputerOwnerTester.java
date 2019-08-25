package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
        StreetUSAddress aAddr = new StreetUSAddress("4321 Court Street","","Los Angeles","CA","90001");
        DateAndPlaceOfBirth aBirth = new DateAndPlaceOfBirth(1994,12,12, "Binghamton","New York", "USA");
        Person cOwner = new Person("Bob","Smith","111-22-3333",aBirth,aAddr);
        Computer cfirst = new Computer("dell","very fast",32,2500,true,3000);
        Computer csecond = new Computer("dell","fast",16,1500,false,1500);
        Computer cthird = new Computer("dell","good",16,800,true,900);
        Computer cfourth = new Computer("dell","decent",8,500,false,500);
        ComputerOwner own1 = new ComputerOwner(cOwner);
        own1.addComputer(cfirst);
        own1.addComputer(csecond);
        own1.addComputer(cthird);
        own1.addComputer(cfourth);
        System.out.println(own1);
        own1.removeComputer(0);
        own1.removeComputer(2);
        System.out.println(own1);

        try(var output = new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwnerTester.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
        StreetUSAddress aAddr2 = new StreetUSAddress("4321 Court Street","","Los Angeles","CA","90001");
        DateAndPlaceOfBirth aBirth2 = new DateAndPlaceOfBirth(1994,12,12, "Binghamton","New York", "USA");
        Person cOwner2 = new Person("Bob","Smith","111-22-3333",aBirth2,aAddr2);
        Computer cfirst2 = new Computer("dell","very fast",32,2500,true,3000);
        Computer csecond2 = new Computer("dell","fast",16,1500,false,1500);
        Computer cthird2 = new Computer("dell","good",16,800,true,900);
        Computer cfourth2 = new Computer("dell","decent",8,500,false,500);
        ComputerOwner own2 = new ComputerOwner(cOwner2);
        own2.addComputer(cfirst2);
        own2.addComputer(csecond2);
        own2.addComputer(cthird2);
        own2.addComputer(cfourth2);
        output.println(own2);
        own2.removeComputer(0);
        own2.removeComputer(2);
        output.println(own2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }
}
