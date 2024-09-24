import java.util.Scanner;
public class AverageWeight {
    public static void main(String[] ar)
    {
        Scanner ob=new Scanner(System.in);
        int noOfPersons=10;
        int[] weights=new int[noOfPersons];
        for(int person=0;person<noOfPersons;person++)
        {
            weights[person]=ob.nextInt();
        }
        int totalWeights=0;
        for(int person=0;person<noOfPersons;person++)
            totalWeights+=weights[person];
        System.out.println((float)totalWeights/noOfPersons);
    } 
}
