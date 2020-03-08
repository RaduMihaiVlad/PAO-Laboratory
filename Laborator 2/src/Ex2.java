import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] par = new int[n];
        int sPar = 0;
        int[] impar = new int[n];
        int sImpar = 0;
        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                par[sPar] = x;
                sPar ++;
            } else {
                impar[sImpar] = x;
                sImpar ++;
            }
        }

        if (sPar > sImpar) {
            System.out.println("Vectorul par are mai multe elemente. Elementele sunt:");
            for (int i = 0; i < sPar; ++i) {
                System.out.println(par[i]);
            }
        } else {

            System.out.println("Vectorul impar are mai multe elemente. Elementele sunt:");
            for (int i = 0; i < sImpar; ++i) {
                System.out.println(impar[i]);
            }
        }

    }

}
