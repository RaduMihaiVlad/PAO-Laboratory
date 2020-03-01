import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }


}
