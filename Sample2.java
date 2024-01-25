import java.util.Scanner;

class Sample2 {
    public static void main(String[] args) {
        int a,b, sum = 0, avg = 0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first no:");
        a = scan.nextInt();
        System.out.println("enter the second no:");
        b = scan.nextInt();
         sum = a+b;
         avg = sum/2;
         System.out.println("sum=" +sum);
         System.out.println("Average=" +avg);

    }
}