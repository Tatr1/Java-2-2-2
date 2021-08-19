public class BmiService {
    public float calculate(float height, float weight) {
        float bmi = weight / ((height / 100) * (height / 100));
        return bmi;
    }
}
