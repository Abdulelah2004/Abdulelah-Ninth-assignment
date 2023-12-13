//Abdulelah Ahmed

package assignment9;


public class CalculateDays {

    public int calculate(int year, int month) {
        // Array to store the number of days in each month
        int daysCount;
        switch (month) {
            case 1:  
            case 3:  
            case 5:  
            case 7:  
            case 8:  
            case 10: 
            case 12:
                daysCount = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                daysCount = 30;
                break;
            case 2:  // February
                daysCount = 28;
                break;
            default:
                daysCount = -1;  // Default value if the month is not valid
                break;
        }
        // Special handling for leap years (February has 29 days)
        if ((month == 2) && ((year % 4) == 0)) {
            return 29;
        } else {
            return daysCount;
        }
    }
}
