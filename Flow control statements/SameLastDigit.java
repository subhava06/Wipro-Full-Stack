// given two integers, to find whether they have same last digit or not

public class SameLastDigit {

    public static boolean sameLastDigit(int a , int b)
    {
           int  lastA = a %10;
           int lastB= b %10;
            return lastA==lastB;

    } 

    public static void main(String[] args) {
        int a = 14892489;
        int b =8743299;
    
        System.out.println(sameLastDigit(a,b));
    }
    
}
