package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        // your implementation:

        double threshold = 0.7;
        for (double[] element: population
             ) {
            for (int i=0; i<element.length; i++)
                element[i] = random.nextDouble() > threshold ? 5 - 10 * random.nextDouble() : element[i];
        }

        //result population
        return population;
    }
}
