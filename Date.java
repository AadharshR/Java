import java.util.Scanner;
public class Date
{
    private int date,month,year;
    public Date()
    {

     date=0;
     month=0;
     year=0;
    }
        public int getDate()
        {
            return date;
        }

        public void setDate()
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the date..");
            date=in.nextInt();
        }

        public int getMonth()
        {
            return month;
        }

        public void setMonth()
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the month");
            month=in.nextInt();
        }
        public int getYear()
        {
            return year;
        }
        public void setYear()
        {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the year..");
            year=in.nextInt();
        }
        public void displayDate()
        {
            System.out.println("The corresponding MM/DD/YYYY format is "+getMonth()+"/"+getDate()+"/"+getYear());
        }
}

