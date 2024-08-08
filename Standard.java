package program;
public class Standard {
    public static void main(String[] args) {
        
        double number = 16.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + squareRoot);

       
        String originalString = "Hello, Java World!";
        String upperCaseString = originalString.toUpperCase();
        String lowerCaseString = originalString.toLowerCase();
        System.out.println( originalString);
        System.out.println(  upperCaseString);
        System.out.println(  lowerCaseString);

       
        int lengthOfString = originalString.length();
        System.out.println("The length of the original string is " + lengthOfString);
    }
}
