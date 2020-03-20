import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tema3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] a = new int[400][400];
        int[][] b = new int[400][400];
        int columnSize = 0;
        for (int i = 0; i < n; ++i) {
            columnSize = 0;
            String x = scanner.nextLine();
            Scanner s1 = new Scanner(x);
            while (s1.hasNext()) {
                a[i][columnSize] = Integer.parseInt(s1.next());
                columnSize++;
            }
        }
        int totalSettedBits = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < columnSize; ++j) {
                if (!Tema3.isPrime(a[i][j])) {
                    b[i][j] = 1;
                    totalSettedBits++;
                } else {
                    b[i][j] = 0;
                }
            }
        }

        System.out.println(totalSettedBits);

    }

    private static boolean isPrime(int elem) {
        for (int i = 2; i * i <= elem; ++i) {
            if (elem % i == 0) {
                return false;
            }
        }
        return true;
    }

}
