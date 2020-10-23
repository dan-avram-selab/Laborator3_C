package ro.mta.facc.selab;

import java.util.Random;

public class RandomOutTask implements Task {
    private int nr;

    public RandomOutTask() {
        this.nr = new Random().nextInt();
    }

    @Override
    public void execute() {
        System.out.println("The number is " + nr);
    }
}
