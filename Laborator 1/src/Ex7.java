import java.util.Scanner;

public class Ex7 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1 || n == 2) {
            System.out.println(1);
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; ++i) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(c);
    }

}
