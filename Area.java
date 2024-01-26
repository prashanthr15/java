import java.lang.*;
import java.util.Scanner;
public class Area { 
    public static void main(String[] args) {
        // int a,b,c;

        int a,b,c;
        double s,area;
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the three sides:");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.err.println("Area of Traiangle" +area);
     }
}