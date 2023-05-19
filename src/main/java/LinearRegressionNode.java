public class LinearRegressionNode implements Node{
    private double weight;

    @Override
    public double predict(double x) {
        return weight * x;
    }

    @Override
    public void fit(double x, double y) {
        weight = 1 / (x * x) * x * y;
    }
}
