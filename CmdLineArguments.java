import java.util.*;
public class CmdLineArguments 
{
    public static void main(String[] args)
    {
       // Scanner sc = new Scanner(System.in);
       // String a = sc.nextLine(args[0]);
       // String b = sc.nextLine(args[1]);
       
        String company = args[0];
        String location = args[1];
        System.out.println(company+" Technologies "+location);
    }
}