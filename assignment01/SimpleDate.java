package assignment01;
import java.time.LocalDate;
public class SimpleDate {
    private int year;
    private int month;
    private int day;

    // public SimpleDate(int yr, int m, int d){
    //     year = yr;
    //     month = m;
    //     day = d;
    // }
     public static SimpleDate of(int yr, int m, int d){
        var returnValue = new SimpleData();
        returnValue.year = yr;
        returnValue.month = m;
        returnValue.day = d;
        return returnValue;
	}
	/**
	 * @param year the year (use 4 digits)
	 * @param month the month (a value of 1 through 12)
	 * @param day the day in the month
	 */

     public boolean before(SimpleDate other){
         return(returnValue.isBefore(other.SimpleDate));
     }

//which returns true if this SimpleDate is temporally before other and false otherwise.
//Write a class SimpleDateTester.java that checks that the method before works.

}
