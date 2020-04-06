import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileOut = new FileWriter("src/main/resources/ex1_output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOut);
        for (int i = 0; i < 2; ++i) {
            try {
                int x1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                if (x1 < x2) {
                    bufferedWriter.write(String.valueOf(x1) + " " + String.valueOf(x2) + "\n" );
                } else {
                    throw new Ex1Error("Introduceti alte numere");
                }
            } catch (Ex1Error e) {
                System.out.println(e.toString());
                int x1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                if (x1 < x2) {
                    bufferedWriter.write(String.valueOf(x1) + " " + String.valueOf(x2) + "\n" );
                }
            }
        }
        bufferedWriter.close();
    }
}
