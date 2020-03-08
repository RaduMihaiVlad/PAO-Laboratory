import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
            if (a[i] == -1) {
                if (i != 0) {
                    System.out.println(sum / i);
                }
                return;
            }
            sum += a[i];
        }

    }

}
