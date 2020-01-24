package lab2;

import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    private static double iter_count = 0;
    private static double max_iter = 50000;

    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!
        iter_count += 1;

        for(double[] solution: population){
            double alpha = random.nextDouble();
            if(alpha >= 0.1) {
                for(int i = 0; i < solution.length; i++){
                    double sigma = random.nextDouble();
                    if(sigma < 1./solution.length){
//                        solution[i] = solution[i] + random.nextGaussian() *
//                                ((1.0 - iter_count/max_iter));

//                        solution[i] = solution[i] + random.nextGaussian() *
//                                (2 * Math.pow((1.0 - iter_count/max_iter), 0.5) + 0.1);

                        solution[i] = solution[i] + random.nextGaussian() * (1.0 - iter_count/max_iter);

                    }
                }
            }
        }

        //result population
        return population;
    }
}
