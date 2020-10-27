package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> raftCarti;

    public Biblioteca() {
        this.raftCarti = new ArrayList<Carte>();
    }

    public Biblioteca(ArrayList<Carte> carti) {
        this.raftCarti = new ArrayList<Carte>();
        for (Carte c : carti)
        {
            this.raftCarti.add(c);
        }
    }

    public void removeBook(Carte c)
    {
        raftCarti.remove(c);
    }

    public void add(Carte carte)
    {
        this.raftCarti.add(carte);
    }

    public void afisare(){
        System.out.println("aaaa");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Biblioteca contine urmatoarele carti:\n");
        for (Carte c : raftCarti)
        {
            builder.append(c.toString());
            builder.append("\n");
        }

        return builder.toString();
    }

    public void sort()
    {
        Collections.sort(raftCarti);
    }

}
