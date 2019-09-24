package lab2;

import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();

        // your implementation:
        double prob = 0.5;

        for (int j=0; j<p1.length; j++)
        {
            if (random.nextDouble() > prob)
            {
                double tmp = p1[j];
                p1[j] = p2[j];
                p2[j] = tmp;
            }
        }

        children.add(p1);
        children.add(p2);
        return children;
    }
}
