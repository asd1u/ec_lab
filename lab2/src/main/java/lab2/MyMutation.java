package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

import static java.lang.Math.*;

public class MyMutation implements EvolutionaryOperator<double[]> {

    public double getGenNum() {
        return genNum;
    }

    public void setGenNum(double genNum) {
        this.genNum = genNum;
    }

    public double genNum = 1;

    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        // your implementation:

        int p_size = population.size();
        int length = population.get(0).length;
        float thresh = 0.6f;
        double newElement;
        double loc = 0, scale = 5 / Math.pow(getGenNum(), 0.5);

        setGenNum(getGenNum() + 1);

        for (double[] element : population)
            if (random.nextFloat() > thresh)
                for (int i = 0; i < length; i++)
                    if (random.nextFloat() > thresh) {
                        newElement = element[i] + random.nextGaussian() * scale + loc;
                        newElement = newElement > 5 ? 5 : newElement;
                        element[i] = newElement < -5 ? -5 : newElement;
//                    if (abs(element[i]) > 5)
//                        System.out.println("Element" + element[i] + "; " + newElement);
                    }

        return population;
    }
}
