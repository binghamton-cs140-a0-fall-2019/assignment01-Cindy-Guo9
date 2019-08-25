package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
	public static void main(String[] args) {
        StreetUSAddress addr1 = new StreetUSAddress("4400 Vestal Pkwy","","Binghamton","NY","13902");
        StreetUSAddress addr2 = new StreetUSAddress("123 Maple Street","Apt 312","Buffalo","NY","14211");
        System.out.println(addr1 + "\n");
        System.out.println(addr2);

        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
        StreetUSAddress xaddr1 = new StreetUSAddress("4400 Vestal Pkwy","","Binghamton","NY","13902");
        StreetUSAddress xaddr2 = new StreetUSAddress("123 Maple Street","Apt 312","Buffalo","NY","14211");
        output.println(xaddr1 + "\n");
        output.println(xaddr2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

    }
}
