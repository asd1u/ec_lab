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
//        double temp_p

        // your implementation:

        int num_dims = p1.length;
        double[] new_p1 = new double[p1.length];
        double[] new_p2 = new double[p2.length];
        int point_div = random.nextInt(num_dims);
        double thresh = random.nextDouble();
        for (int j=0; j<p1.length; j++)
        {
//            if (random.nextFloat() > thresh)
//            {
//                double temp_p = p1[j]; //point_div > j ?  : p2[j];
//                p1[j] = p2[j]; //> j ? p2[j] : p1[j];
//                p2[j] = temp_p;
//            }
            double t1 = p1[j];
            double t2 = p2[j];
            new_p1[j] = thresh * t1 + (1 - thresh) * t2;
            new_p2[j] = thresh * t2 + (1 - thresh) * t1;
        }

        children.add(new_p1);
        children.add(new_p2);
        return children;
    }
}
