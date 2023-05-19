public class Main {
    public static void main(String[] args) {
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] y = {2.0, 4.0, 6.0, 8.0, 10.0};

        LinearEnsemble ensemble = new LinearEnsemble();

        ensemble.fit(x, y);

        double prediction = ensemble.predict(6.0);
        System.out.println("Vorhersage für x = 6.0: " + prediction);
    }
}
