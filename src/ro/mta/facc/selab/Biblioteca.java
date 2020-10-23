package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> carti;

    public Biblioteca() {
        this.carti = new ArrayList<Carte>();
    }

    public Biblioteca(ArrayList<Carte> carti) {
        this.carti = new ArrayList<Carte>();
        for (Carte c : carti)
        {
            this.carti.add(c);
        }
    }

    public void removeBook(Carte c)
    {
        carti.remove(c);
    }

    public void add(Carte carte)
    {
        this.carti.add(carte);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Biblioteca contine urmatoarele carti:\n");
        for (Carte c : carti)
        {
            builder.append(c.toString());
            builder.append("\n");
        }

        return builder.toString();
    }

    public void sort()
    {
        Collections.sort(carti);
    }

}
