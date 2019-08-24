package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
        Computer first = new Computer("dell","very fast",32,2500,true,3000);
        System.out.println(first);

        Computer second = new Computer("dell","fast",16,1500,false,1500);
        System.out.println(second);

        Computer third = new Computer("dell","good",16,800,true,900);
        System.out.println(third);

        Computer fourth = new Computer("dell","decent",8,500,false,500);
        System.out.println(fourth);

		// try(var output =new PrintWriter(new FileOutputStream(
		// 	    new File("output.txt"), true /* true means append to file */))) {
		// 	output.println("\nTESTS FOR Computer.java:");
        //
		// //Copy all your lines above, add an extra "2" to every variable name
		// // and replace every System.out.print or System.out.println
		// // by output.print or output.println
        // Computer first2 = new Computer("dell","very fast",32,2500,true,3000);
        // output.out.println(first2);
        //
        // Computer second2 = new Computer("dell","fast",16,1500,false,1500);
        // output.out.println(second2);
        //
        // Computer third2 = new Computer("dell","good",16,800,true,900);
        // output.out.println(third2);
        //
        // Computer fourth2 = new Computer("dell","decent",8,500,false,500);
        // output.out.println(fourth2);
        //
		// } catch (FileNotFoundException e) {
		// 	e.printStackTrace();
		// }
	}
}
