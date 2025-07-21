public class OddEven {
    
    public static void isOddEven(int a)
    {
        if(a %2 == 0)
        {
            System.out.println(a+ " is even");
           // return true;
        }
        else
           System.out.println(a+ " is odd");
           //return false;
    }

    public static void main(String[] args) {
        int a =20220;
        isOddEven(a);
    }
}
