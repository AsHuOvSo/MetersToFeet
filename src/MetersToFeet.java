//Import scanner and math library
import java.util.Scanner;
import java.lang.Math;

public class MetersToFeet {
    //start of main code
    public static void main(String[] args) {
        //starting line
        System.out.println("Please enter amount in meters:");
        //Scanning and converting to datatype
        Scanner metersInput = new Scanner(System.in);
        double meters = metersInput.nextDouble();
        //math
        double feet = meters * 3.2786;
        //output
        System.out.println(meters + " meters in feet are " + feet);
    }
}
