import java.util.Scanner;

enum WeekDay{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class WeekDays {
    public static void main(String[] ar)
    {
        Scanner ob=new Scanner(System.in);
        int days=ob.nextInt();
        WeekDay dayName=WeekDay.values()[days%7];
        System.out.println(dayName);
    }
}
