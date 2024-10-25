package BasicsOfJava;
import java.util.Scanner;

public class squarInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            System.out.println(x * x);
        }
    }
}
