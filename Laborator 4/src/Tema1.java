import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tema1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = new String(scanner.next());
        String str2 = new String(scanner.next());
        String sortedStr1 = str1.chars()
                        .sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
        String sortedStr2 = str2.chars()
                        .sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
        System.out.println(sortedStr1.equals(sortedStr2));
    }

}
