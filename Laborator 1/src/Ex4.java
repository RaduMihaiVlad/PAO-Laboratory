import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1;
        for (int i = 2; i <= n; ++i) {
            ans *= i;
        }
        System.out.println(ans);
    }

}
