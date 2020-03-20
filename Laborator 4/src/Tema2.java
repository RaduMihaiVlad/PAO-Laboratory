import java.util.Scanner;

public class Tema2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.next();
        }
        String maxPalindromeString = null;
        for (int i = 0; i < n; ++i) {
            if (Tema2.palindrome(a[i].toString())) {
                b.append(a[i]);
                if (maxPalindromeString == null || maxPalindromeString.length() < a[i].length()) {
                    maxPalindromeString = a[i];
                }
            }
        }

        System.out.println(maxPalindromeString);
    }

    static boolean palindrome(String sString) {
        StringBuffer s = new StringBuffer(sString);
        return s.toString().equals(s.reverse().toString());
    }

}
