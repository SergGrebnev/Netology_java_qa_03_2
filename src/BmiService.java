public class BmiService {
    public int calculate(double heightMeter, double weightKilogram) {
        double bmi = weightKilogram / (heightMeter * heightMeter);
        return ((int) bmi);
    }
}
