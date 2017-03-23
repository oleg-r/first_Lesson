package pac1;

/**
 * Created by admin on 23.02.2017.
 */
public class FirstClass {
    int int1=1;
    double name=65.8;
    boolean bool=true;

    String strdigit= "2";

    public static String nameofMethod () {
         int secondDigit = 5;
         return "method"+secondDigit;
    }

    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";
        int digit1 = 5;
        int digit2 = 6;
        String stringsumm = hello+world;
      //  System.out.println (hello+""+world);
                if (digit1+digit2>50) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
      //  System.out.println(digit1 * digit2/ digit2);


    }

}
