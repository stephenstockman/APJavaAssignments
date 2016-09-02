
/**
 * Stephen Stockman
 * AP Java
 * DateObject
 * Due:
 */
public class DateObject
{
    private int day,month,year;

    public DateObject()
    {
        day=3;
        month=10;
        year=1970;
    }

    public DateObject(int d,int m,int y)
    {
        this();
        day=d;
        month=m;
        year=y;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public int setDate(int d,int m, int y)
    {
        day=d;
        month=m;
        year=y;

        if(year < 1 || year > 9999)//correct year
        {
            return 3;
        }

        if(month <1 || month > 12)//correct month
        {
            return 2;
        }

        //TODO edit lazy month condition
        if((day==31)&&(month==2|| month==4 || month==6 || month==9|| month==11) || (day > 31))//31 day issue
        {
            return 1;
        }
        if(((day==30) || (day==29)) && (month==2))////30 day issue
        {
            if(((year % 4) == 0) && (((year % 100) != 0) || ((year %400) == 0)))//leap year issue
                return 0;//it's a leap year
            else
                return 1;
        }
        return 0;//date allowed
    }

    public long getJulianDay() {
        int newMonth, newYear;
        long julian = 0;
        int julianAdjust = (int) (.01 * year);
        newYear = year;
        newMonth = month;
        if (month <= 2) {
            newYear--;
            newMonth += 13;
        } else {
            newMonth++;
        }
        julian = ((long) (365.25 * newYear) + (long) (30.6001 * newMonth) + (day + 1720995));
        if ((year > 1582) || ((year == 1582) && (month > 10)) || ((year == 1582) && (month == 10) && (day > 15))) {
            julian = julian + 2 - julianAdjust + (long) (.25 * julianAdjust);
        }
        return julian;
    }

    public String getDayOfWeek()
    {
        int idow=(int)((getJulianDay()+1)%7);
        String sdow="";
        switch(idow)
        {
            case 0:
            return "Sunday";
            case 1:
            return "Monday";
            case 2:
            return "Tuesday";
            case 3:
            return "Wednesday";
            case 4:
            return "Thursday";
            case 5:
            return "Friday";
            case 6:
            return "Saturday";
            default:
            return "";
        }
    }

    public String mName()
    {
        switch(month)
        {
            case 1:
            return "January";
            case 2:
            return "February";
            case 3:
            return "March";
            case 4:
            return "April";
            case 5:
            return  "May";
            case 6:
            return "June";
            case 7:
            return  "July";
            case 8:
            return  "August";
            case 9:
            return "September";
            case 10:
            return  "October";
            case 11:
            return  "November";
            case 12:
            return  "December";
            default:
            return "";
        }
    }
    
    public String toString()
    {
     return (mName()+ " " + getDay() + ", " + getYear() + " is a " + getDayOfWeek() + ".\nIt's Julian Day Number is " + getJulianDay() + ".");   
    }
}