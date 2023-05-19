import java.util.ArrayList;
import java.util.List;

public class LinearEnsemble extends Ensemble{
    private final List<LinearRegressionNode> nodes;

    public LinearEnsemble() {
        nodes = new ArrayList<>();
    }

    @Override
    void fit(double[] x, double[] y) {
        for (int i = 0; i < x.length; i++) {
            LinearRegressionNode node = new LinearRegressionNode();
            node.fit(x[i], y[i]);
            nodes.add(node);
        }
    }

    @Override
    public double predict(double x) {
        double sum = 0;
        for (LinearRegressionNode node : nodes) {
            sum += node.predict(x);
        }
        return sum / nodes.size();
    }
}
