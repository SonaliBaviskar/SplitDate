import java.util.*;
class SplitDate
{
public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date");
        String x = sc.nextLine();
        String[] N =x.split("-");
        System.out.println("Day: " +N[0]);
        System.out.println("Month: " +N[1]);
        System.out.println("Year: " +N[2]);
        
    }
}
