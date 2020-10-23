package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args)
    {
        Carte carte = new Carte("Harry Potter and the Deathly Hallows", "J.K. Rowlings", 2011, 600);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.add(carte);
        biblioteca.add(new Carte("Baltagul", "Vlad Florea", 1930, 200));
        biblioteca.add(new Carte("Game of Thrones", "George R.R. Martin", 2006, 800));
        biblioteca.sort();
        System.out.println(biblioteca.toString());
    }
}
