package BasicsOfJava;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend: ");
        int a= sc.nextInt();
        System.out.println("Enter divisor: ");
        int b= sc.nextInt();
        int q= a/b;
        int r= a-(b*q);
        System.out.println("The reminder when "+a+" is divisor of "+b+" is "+r);

    }
}
