public class Main {
    public static void main(String[] args) {
        IMTService service = new IMTService();
        float weight = 75;
        float growth = 1.75F;
        String imt =String.format("Ваш ИМТ: "+ "%.2f",service.calculate(weight, growth));
        System.out.println(imt);
    }
}
