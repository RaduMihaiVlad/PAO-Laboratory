import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] studenti = new Student[n];

        for (int i = 0; i < n; ++i) {
            String nume = scanner.next();
            float nota = Float.parseFloat(scanner.next());
            studenti[i] = new Student(nume, nota);
        }

        for (int i = 0; i < n; ++i) {
            System.out.println(studenti[i]);
        }
    }
}

class Student {
    private String nume;
    private float nota;

    Student(String nume, float nota) {
        this.nume = nume;
        this.nota = nota;
    }

    void setNume(String nume) { this.nume = nume;}
    void setNota(float nota) { this.nota = nota;}
    String getNume() { return this.nume;}
    float getNota() { return this.nota;}

    public String toString() {
        return this.nume + " " + String.valueOf(this.nota);
    }
}
