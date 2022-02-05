public class IMTService {
    public float calculate(float weight, float growth) {
        float imt = weight / (growth * growth);
        return imt;
    }
}

//ИМТ = m/h2, где: m — масса тела в килограммах, h — рост в метрах
