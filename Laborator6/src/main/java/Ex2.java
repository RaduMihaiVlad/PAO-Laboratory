import java.io.*;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        FileInputStream fileInputStream = new FileInputStream("src/main/resources/parole.txt");

        int incorectPass = 0;
        boolean correctData = false;
        for (int i = 0; i < 5; ++i) {
            String ans = checkForUserAndPassword(username, password, fileInputStream);
            if (ans.equals("Correct")) {
                correctData = true;
                System.out.println("Acces permis.");
                break;
            } else if (ans.equals("Parola Incorecta")) {
                System.out.println("Parola Gresita");
                incorectPass++;
                if (incorectPass == 3) {
                    System.out.println("Cont blocat.");
                    break;
                }
            }
            username = scanner.nextLine();
            password = scanner.nextLine();
            fileInputStream = new FileInputStream("src/main/resources/parole.txt");
        }

        if (!correctData) {
            System.out.println("Nu ai cont. Inregistreaza-te.");
        }

    }

    public static String checkForUserAndPassword(String username, String password, FileInputStream fileInputStream) throws IOException {
        String currentUsername = readNextString(fileInputStream);
        String currentPassword = readNextString(fileInputStream);
        StringBuilder stringBuilderPassword = new StringBuilder(currentPassword);
        stringBuilderPassword.deleteCharAt(currentPassword.length() - 1);
        currentPassword = stringBuilderPassword.toString();
        while (!currentUsername.equals("End")) {
            if (currentUsername.equals(username)) {
                if (currentPassword.equals(password)) {
                    return "Correct";
                } else {
                    return "Parola Incorecta";
                }
            }
            currentUsername = readNextString(fileInputStream);
            currentPassword = readNextString(fileInputStream);
            stringBuilderPassword = new StringBuilder(currentPassword);
            stringBuilderPassword.deleteCharAt(currentPassword.length() - 1);
            currentPassword = stringBuilderPassword.toString();
        }
        return "Cont inexistent.";
    }

    public static String readNextString(FileInputStream fileInputStream) throws IOException {
        StringBuilder ans = new StringBuilder();

        int x = fileInputStream.read();
        if (x == -1) {
            return "End";
        }
        char nextChar = (char) x;
        while (nextChar != ' ' && nextChar != '\n') {
            ans.append(nextChar);
            int x1 = fileInputStream.read();
            if (x1 == -1) {
                return ans.toString();
            }
            nextChar = (char) x1;
        }
        return ans.toString();


    }

}
