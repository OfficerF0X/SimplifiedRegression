public abstract class Ensemble implements Predictable {
    abstract void fit(double[] x, double[] y);
    private Node[] nodes;
}
