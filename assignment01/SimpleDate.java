package assignment01;
import java.time.LocalDate;
public class SimpleDate {
    private int year;
    private int month;
    private int day;

    public static SimpleDate of(int yr, int m, int d){
        var returnValue = new SimpleDate();
        returnValue.year = yr;
        returnValue.month = m;
        returnValue.day = d;
        return returnValue;
	}
	/**
	 * @param yr the year (use 4 digits)
	 * @param m the month (a value of 1 through 12)
	 * @param d the day in the month
	 */

     public boolean before(SimpleDate other){
         if(this.year == other.year && this.month == other.month &&
         this.day == other.day){
             return false;
        }

        if(this.year < other.year){
            return true;
        }else if(this.year > other.year){
            return false;
        }else if(this.year == other.year){
            if(this.month < other.month){
                return true;
            }else if(this.month > other.month){
                return false;
            }else if(this.month == other.month){
                if(this.day < other.day){
                    return true;
                }else if(this.day > other.day){
                    return false;
                }
            }
        }
    return false;
    }



}
