package BasicsOfJava;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pi= 3.1416;
        double area = pi * radius * radius;
        System.out.println("The area of circle is "+area);
    }
}
