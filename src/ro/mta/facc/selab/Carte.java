package ro.mta.facc.selab;

public class Carte implements Comparable<Carte> {
    private String titlu;
    private String iban;
    private String autor;
    private int anPublicatie;
    private int nrPagini;

    public String getTitlu() {
        return titlu;
    }

    @Override
    public int compareTo(Carte o) {
        if (this.nrPagini < o.nrPagini)
            return -1;
        if (this.nrPagini > o.nrPagini)
            return 1;
        return 0;
    }


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Carte(String titlu, String autor, int anPublicatie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu + " " + this.autor + " " + ", publicată în anul " + this.anPublicatie;
    }
}
