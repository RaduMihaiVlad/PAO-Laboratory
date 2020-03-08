public class Ex3 {

    public static void main(String[] args) {
        Caine caine = new Caine(5, "Azorel");
        System.out.println(caine.afisareDetaliiAnimal());
    }
}

class Caine {

    private int varsta;
    private String nume;

    Caine(int varsta, String nume) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void setVarsta(int varsta) { this.varsta = varsta;}
    public void setNume(String nume) { this.nume = nume;}
    public int getVarsta() { return this.varsta;}
    public String getNume() { return this.nume;}

    public String afisareDetaliiAnimal() { return "Acest caine are numele " + this.nume + " si are varsta de " + this.varsta + " ani.";}

}